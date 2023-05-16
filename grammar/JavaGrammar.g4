grammar JavaGrammar;

methode       : TYP NAME KLAMMERAUF KLAMMERZU block;
block         : BLOCKAUF anwfolg BLOCKZU;
anwfolg       : anweisung+;
anweisung     : block | zuweisung | bedanw | solangeanw;
zuweisung     : NAME ZUWEISUNGSOP ausdruck SEMIKOLON;
bedanw        : WENN KLAMMERAUF vergleich KLAMMERZU anweisung | WENN KLAMMERAUF vergleich KLAMMERZU anweisung SONST anweisung;
solangeanw    : SOLANGE KLAMMERAUF vergleich KLAMMERZU anweisung;
vergleich     : ausdruck VERGLEICHSOP ausdruck;
ausdruck      : term | term STRICHOPERATOR ausdruck;
term          : faktor | faktor PUNKTOPERATOR term;
faktor        : NAME | ZAHL | KLAMMERAUF ausdruck KLAMMERZU;

TYP           : ('a'..'z')+?;
NAME          : ('a'..'z')+?;
BLOCKAUF      : '{'?;
BLOCKZU       : '}'?;
KLAMMERAUF    : '('?;
KLAMMERZU     : ')'?;
ZUWEISUNGSOP  : '='?;
VERGLEICHSOP  : '=='? | '!='? | '<'? | '>'? | '<='? | '>='?;
STRICHOPERATOR: '+'? | '-'?;
PUNKTOPERATOR : '*'? | '/'?;
ZAHL          : ('0'..'9')+?;
SEMIKOLON     : ';'?;

WENN          : 'if';
SONST         : 'else';
SOLANGE       : 'while';

//Whitespace    : [ \t\r\n]+ -> skip;
//WS            : (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;};