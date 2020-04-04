# Lexer Implementation


# How to use:
The Main.java file can invoked from the command line (cmd) with the line and takes the input file (ex. input.cl)
```
//Compile the file
javac -cp "( ANTLRPATH HERE )\antlr-4.8-complete.jar;" src/Main.java src/coolLexer.java

 

//Run the file with the parameter
java Main good.cl
```

 

# Design Phase :
The thought proccess was to first check for all available keywords first and then check for the operators. If the code's syntax is correct there will be no errors, but if there was an error it wouldn't match any of the predefined rules in our grammar and that would raise an error.

 

# Test Cases :
1) The good.cl file was choosen to contain as many tokens as possible with alot of keywords. (The file contains code to check if a text is a palindrome or not) 

 

2) The bad.cl file contains the same code with some extra charachters that wouldn't be recogonized by our lexical analyzer. 
The only thing that we thought of and wouldn't be recognized is the special charachters (!, #, etc..)