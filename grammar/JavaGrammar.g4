grammar JavaGrammar;
main          : methode;
methode       : TYP ' ' NAME '(' ') ' block;
block         : '{' anwfolg '}';
anwfolg       : anweisung+;
anweisung     : block | zuweisung | bedanw | solangeanw;
zuweisung     : NAME ' = ' ausdruck ';';
bedanw        : 'if ' '(' vergleich ') ' anweisung | 'if ' '(' vergleich ') ' anweisung ' else ' anweisung;
solangeanw    : 'while ' '(' vergleich ') ' anweisung;
vergleich     : ausdruck ' ' vergleichsop ' ' ausdruck | ausdruck vergleichsop ausdruck;
ausdruck      : term | term ' ' strichoperator ' ' ausdruck | term strichoperator ausdruck;
term          : faktor | faktor ' ' punktoperator ' ' term | faktor punktoperator term;
faktor        : NAME | ZAHL | '(' ausdruck ')';
vergleichsop  : '==' | '!=' | '<' | '>' | '<=' | '>=';
strichoperator: '+' | '-';
punktoperator : '*' | '/';
TYP           : 'void' | 'String' | 'int';
NAME          : ('a'..'z')+;
WHITESPACE    : ('\t' | '\r' | '\n')+ -> skip;
// BLOCKAUF      : '{';
// BLOCKZU       : '}';
// KLAMMERAUF    : '(';
// KLAMMERZU     : ')';
// ZUWEISUNGSOP  : '=';
// VERGLEICHSOP  : '==' | '!=' | '<' | '>' | '<=' | '>=';
// STRICHOPERATOR: '+' | '-';
// PUNKTOPERATOR : '*' | '/';
ZAHL          : ('0'..'9')+;
// SEMIKOLON     : ';';

// WENN          : 'if';
// SONST         : 'else';
// SOLANGE       : 'while';

// Whitespace    : [ \t\r\n]+ -> skip;
// WS            : (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;};