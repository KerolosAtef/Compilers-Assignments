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

SEMICOLON : ';';TILDE :'~';fragment LE : '<=' ;fragment LT : '<' ;fragment GT :'>';
fragment GE : '>='; fragment MINUS : '-';fragment PLUS : '+';fragment MUL : '*';
LPAREN : '(' ; RPAREN : ')';fragment EQUALS : '=' ;fragment AT : '@' ;
 COLON : ':' ;COMMA : ',' ;fragment DIVIDE : '/' ;fragment Backslash : '\\' ;
LARROW : '<-';  RARROW : '->'; LBRACE : '{'; RBRACE : '}'; fragment UNDERSCORE: '_';
fragment Dq : '"' ;fragment Sq : '\'';fragment MOD : '%'; MINAOP: '=>';

OPS : (LT | LE | EQUALS);

fragment SpecialChars: SEMICOLON|TILDE |LE |LT |GT |GE |MINUS|PLUS |MUL |LPAREN |RPAREN|EQUALS|AT|COLON|COMMA
             |DIVIDE|LARROW |RARROW |LBRACE |RBRACE |Dq |Sq |MOD |Backslash;


fragment Digit : [0-9];
fragment Letter : [A-Za-z];
ID : [a-z] (Letter| Digit | UNDERSCORE)* ;
TYPE : [A-Z] (Letter | UNDERSCORE | Digit)*;
Integer:Digit+;
//Decimal :(PLUS |MINUS)?Digit+(.Digit+)? (E(PLUS|MINUS)?Digit+)?;
String : Dq (Letter|Digit|SpecialChars|' ')* Dq ;
Whitespace : [ \t\r\n]+ -> skip;
ADDOPS: PLUS | MINUS;
MULOPS: DIVIDE|MUL;
ERROR :. ;