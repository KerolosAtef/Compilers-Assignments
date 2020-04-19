import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static private ArrayList<Token> errors = new ArrayList<>();
    static private ArrayList<Token> output = new ArrayList<>();
    static private String[] tNames;
    static private HashMap<String,Integer> tNums = new HashMap<String,Integer>();
    static private String outputTree;
    /**
    * The Main function is called either from an IDE or the CMD with 1 or two input parameters.
    *
    * \param[in] inputFile.cl The source code of the COOL language.
    * \param[in] inputFile.cl-lex The text file containing the tokens of a source code already lexed before.
    * \param[in] outFile.cst This parameter is optional and will be used to store the parsing tree in it.
    */

    public static void main(String[] args) throws IOException {

        tNames = coolParserLexer.makeSymbolicNames();
        tokenToNums();

        String fileName = "good.cl";
        if (args.length > 0) {
            fileName = args[0];
        }
        int length = fileName.length();
        if(fileName.charAt(length - 2) == 'c' && fileName.charAt(length - 1) == 'l'){
            parseFromFile(fileName);
        }
        else
            parseFromTokens(fileName);
        if(args.length == 2)
            writeTree(args[1]);
    }

    /**
     * This function is called when is the input is a source code.
     * The code is first tokenized and check for errors, then the parser handles those tokens and parses them into a parsing tree.
     *
     * @param srcFile The input code file (ex. input.cl)
     */
    public static void parseFromFile(String srcFile) {
        FileInputStream is;
        try {
            is = new FileInputStream(srcFile);
            org.antlr.v4.runtime.ANTLRInputStream input = new org.antlr.v4.runtime.ANTLRInputStream(is);
            coolParserLexer mLexer = new coolParserLexer(input);
            List<? extends Token> tokens = mLexer.getAllTokens();
            ListTokenSource mySource = new ListTokenSource(tokens);
            CommonTokenStream tokenList = new CommonTokenStream(mySource);

            for (Token token : tokens) {
                if (tNames[token.getType()].equals("ERROR")) {
                    errors.add(token);
                } else {
                    output.add(token);
                }
            }
            if (errors.isEmpty()) {
                /*BufferedWriter writer = new BufferedWriter(new FileWriter(srcFile + "-lex"));
                for (Token token : output) {
                    writer.write(token.getLine() + "\n");
                    writer.write(tNames[token.getType()] + "\n");
                    writer.write(token.getText() + "\n");
                }
                writer.close();*/

                coolParserParser parser = new coolParserParser(tokenList);
                var tree = parser.our_program();
                outputTree = tree.toStringTree(parser);
                System.out.println(outputTree);

            } else {
                for (Token errorToken : errors) {
                    System.out.printf("Lexer ERROR: Line %s - invalid character %s\n",
                            errorToken.getLine(),
                            errorToken.getText());
                }
            }
        } catch (Exception e){
            System.out.println("7asby Allah");
        }

    }


    /**
     * This function is called when is the input is a text file containing the token description.
     * The text is converted into CommonToken objects and then fed to the parser to be parsed into an parsing tree.
     *
     * @param srcFile The input token text file of (ex. input.cl-lex)
     */
    public static void parseFromTokens(String srcFile)
    {
        List<CommonToken> tokens = translateTokens(srcFile);
        if(tokens == null)
            return;
        ListTokenSource mySource = new ListTokenSource(tokens);
        CommonTokenStream tokenList = new CommonTokenStream(mySource);
        coolParserParser parser = new coolParserParser(tokenList);
        var tree = parser.our_program();
        outputTree = tree.toStringTree(parser);
        System.out.println(outputTree);
    }

    /**
     * This function handles the conversion of the text file into CommonToken list.
     * @param srcFile The text source file.
     * @return CommonToken List containing the tokens to be parsed.
     */
    public static List<CommonToken> translateTokens(String srcFile)
    {
        List<CommonToken> tokens = new ArrayList<>();
        CommonToken myToken;
        try {
            File file = new File(srcFile);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st, st2, st3;
            while ((st = br.readLine()) != null)
            {
                st2 = br.readLine();
                st3 = br.readLine();
                myToken = new CommonToken(tNums.get(st2) , st3);
                tokens.add(myToken);
            }
            return tokens;
        }
        catch (Exception e){
            System.out.println("File Not Found!");
        }
        return null;
    }

    private static void tokenToNums()
    {
        int count = 0;
        for(String st: tNames)
            tNums.put(st, count++);
    }

    /**
     * This function writes the output tree into the specified file.
     * @param outFile The destination file to write the tree in.
     */
    public static void writeTree(String outFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            writer.write(outputTree);
            writer.close();
        } catch (Exception e)
        {
            return;
        }

    }
}
