grammar ugk;

@header{
package parser;
}

programme : algorithme EOF
    | fonction EOF
    ;

algorithme : 'algorithme' 'debut' algofoncblock 'fin'
    ;

fonction : 'fonction' type IDF '(' (funcdecargs)? ')' 'debut' algofoncblock 'fin'
    ;

funcdecargs : type IDF (',' type IDF)*
    ;

algofoncblock : (block)*
    ;

currblock : (block)*
    ;

block : declaration
    | assignation
    | si
    | tantque
    | appelfonc
    | pour
    ;

assignation : IDF ':=' expr
    ;

si : 'si' expr 'alors' currblock ('sinon' currblock)? 'fsi'
    ;

tantque : 'tant' 'que' expr 'faire' currblock 'ftant'
    ;

pour : 'pour' IDF 'de' expr 'a' expr 'faire' currblock 'fpour'
    ;

appelfonc : IDF '(' (foncargs)? ')'
    ;

foncargs : expr (',' expr)*
    ;

declaration : type IDF (':=' expr)?
    ;

type : primitive
    | TYPE
    ;

primitive : 'entier'
    | 'chaine'
    | 'caractere'
    | 'double'
    | 'booleen'
    | 'flottant'
    ;

expr : addsousexpr
    | multordivexpr
    | exprres
    ;

exprres : appelfonc
    | 'nil'
    | '-' exprres // Instruction a corriger car crash
    | '(' expr ')'
    | 'non' expr
    | multipleexprcomp
    | FLOAT
    | DOUBLE
    | INTEGER
    | STRING
    | BOOLEEN
    | IDF
    ;

multipleexprcomp : '°' (foncargs)? '°'
    ;

addsousexpr : multordivexpr (PMO expr)?
    ;

multordivexpr : boolexpr (MDE expr)?
    ;

boolexpr : exprres (BOOLOP expr)?
    ;

PMO : '+' | '-' | 'ou' ;
MDE : '*' | '/' | 'mod' | 'quo' | 'et' ;
BOOLOP : '<=' | '>=' | '!=' | '=' | '>' | '<' ;
BOOLEEN : 'true' | 'false' ;
STRING : '"' .*? '"' ;
INTEGER : [0-9]+ ;
DOUBLE : (INTEGER)?'.'INTEGER ;
FLOAT : DOUBLE'f' ;
IDF : [a-zA-Z_][a-zA-Z0-9_]* ;
TYPE : [a-zA-Z][a-zA-Z0-9]* ;
WS : ('\n'+ | '\t'+ | ' '+ | '\r'+) -> skip ;