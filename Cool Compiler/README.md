# Lexer Implementation

 

The project team members are :
1. Kerolos Atef Ibrahim
2. Toqa Magdy Fouad
3. Mina Latif Lotfy
4. Muhammad Mostafa Kassab
5. Rama Najm El-Deen

 

The project is split into 5 phases:
1. Lexical Analysis

 

The 4 other phases are still under development.

 

# How to use:
The Main.java file can invoked from the command line (cmd) with the line and takes the input file (ex. input.cl)
```
//Compile the file
javac Main.java input.cl

 

//Run the file
java Main
```

 

# Design Phase :
The thought proccess was to first check for all available keywords first and then check for the operators. If the code's syntax is correct there will be no errors, but if there was an error it wouldn't match any of the predefined rules in our grammar and that would raise an error.

 

# Test Cases :
1) The good.cl file was choosen to contain as many tokens as possible with alot of keywords. (The file contains code to check if a text is a palindrome or not) 

 

2) The bad.cl file contains the same code with some extra charachters that wouldn't be recogonized by our lexical analyzer. 
The only thing that we thought of and wouldn't be recognized is the special charachters (!, #, etc..)