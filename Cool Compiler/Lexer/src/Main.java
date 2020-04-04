import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    static ArrayList<Token> errors = new ArrayList<>();
    static ArrayList<Token> output = new ArrayList<>();
    static String fileName ;
    static BufferedWriter writer ;
    public static void main(String[] args) throws IOException {
        fileName = "good.cl";
        if (args.length >0){
            fileName = args[0];
        }
        CharStream input = CharStreams.fromFileName(fileName);
        coolLexer mLexer = new coolLexer(input);
        List<? extends Token> tokens =  mLexer.getAllTokens();
        String []tNames  = coolLexer.makeSymbolicNames();
        for (Token token : tokens) {
            if (tNames[token.getType()].equals("ERROR")){
                errors.add(token);
            }
            else {
                output.add(token);
            }
        }
        if (errors.isEmpty()){
            writer = new BufferedWriter(new FileWriter(fileName+"-lex"));
            for (Token token : output) {
                if (tNames[token.getType()].equals("INT")||
                        tNames[token.getType()].equals("Literal")||
                        tNames[token.getType()].equals("ID")||
                        tNames[token.getType()].equals("TYPE")
                ){
                    writer.write(token.getLine() + "\n");
                    writer.write(tNames[token.getType()] + "\n");
                    writer.write(token.getText() + "\n");
                }
                else {
                    writer.write(token.getLine() + "\n");
                    writer.write(tNames[token.getType()] + "\n");
                }
            }
            writer.close();
        }
        else {
            reportErrors();
        }
    }
    public static void reportErrors() {
        for (Token errorToken : errors) {
            System.out.printf("Lexer ERROR: Line %s - invalid character %s\n",
                    errorToken.getLine(),
                    errorToken.getText());
        }
   }
}
