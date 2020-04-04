lexer grammar coolLexer;

fragment A : [Aa];fragment B : [Bb];fragment C : [Cc];fragment D : [Dd];fragment E : [Ee];fragment F : [Ff];
fragment G : [Gg];fragment H : [Hh];fragment I : [Ii];fragment J : [Jj];fragment K : [Kk];fragment L : [Ll];
fragment M : [Mm];fragment N : [Nn];fragment O : [Oo];fragment P : [Pp];fragment Q : [Qq];fragment R : [Rr];
fragment S : [Ss];fragment T : [Tt];fragment U : [Uu];fragment V : [Vv];fragment W : [Ww];fragment X : [Xx];
fragment Y : [Yy];fragment Z : [Zz];
//Keywords
IF : I F ;INHERITS : I N H E R I T S ;CASE : C A S E ;CLASS : C L A S S ;FOR : F O R  ;DOT : '.';
ELSE : E L S E ;FI : F I ;ESAC :  E S A C ;FALSE : 'f'A L S E;TRUE : 't' R U E;IN : I N ;ISVOID : I S V O I D ;
LET : L E T ;LOOP : L O O P ;POOL : P O O L ;NOT : N O T ;OF : O F ;NEW : N E W ;THEN : T H E N ;
WHILE : W H I L E ;
TYPE :'String' |'Int'|'Bool' ;

SEMICOLON : ';';TILDE :'~';LE : '<=' ;LT : '<' ;GT :'>';GE : '>=';MINUS : '-';PLUS : '+';MUL : '*';
LPAREN : '(';RPAREN : ')';EQUALS : '=' ;AT : '@' ;COLON : ':' ;COMMA : ',' ;DIVIDE : '/' ;Backslash : '\\' ;
LARROW : '<-';RARROW : '->';LBRACE : '{';RBRACE : '}';Dq : '"' ;Sq : '\'';MOD : '%' ;

SpecialChars :SEMICOLON|TILDE |LE |LT |GT |GE |MINUS|PLUS |MUL |LPAREN |RPAREN|EQUALS|AT|COLON|COMMA
             |DIVIDE|LARROW |RARROW |LBRACE |RBRACE |Dq |Sq |MOD |Backslash ;


fragment Digit : [0-9];
fragment Letter : [A-Za-z];
ID : ('_'|Letter) (Letter| Digit|'_')* ;
Integer:(PLUS |MINUS)?Digit+(E(PLUS|MINUS)?Digit+)?;
Decimal :(PLUS |MINUS)?Digit+(.Digit+)? (E(PLUS|MINUS)?Digit+)?;
String : Dq (Letter|Decimal|SpecialChars)* Dq ;
Whitespace: (' ' | '\t' | '\r' | '\n') { skip(); } ;
ERROR :. ;