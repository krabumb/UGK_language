grammar ugk;

@header{
package parser;
}

ugk : (imports)? programme EOF ;

imports : ('importer' '<' FILENAME '.ugk' '>')+ ;

programme : (fonction)* algorithme
    | (fonction)+
    ;

algorithme : 'algorithme' 'debut' algofoncblock 'fin'
    ;

fonction : 'fonction' type IDF '(' (funcdecargs)? ')' 'debut' algofoncblock 'fin'
    ;

funcdecargs : type IDF (',' type IDF)*
    ;

algofoncblock : (instruction)*
    ;

block : (instruction)*
    ;

instruction : declaration
    | assignation
    | si
    | tantque
    | appelfonc
    | pour
    | retourne
    ;

retourne : 'retourne' (expr)?
    ;

assignation : IDF ':=' expr
    ;

si : 'si' expr 'alors' block ('sinon' block)? 'fsi'
    ;

tantque : 'tant' 'que' expr 'faire' block 'ftant'
    ;

pour : 'pour' IDF 'de' expr 'a' expr 'faire' block 'fpour'
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
    ;

addsousexpr : multordivexpr (pmo expr)?
    ;

multordivexpr : boolexpr (mde expr)?
    ;

boolexpr : exprres (boolop expr)?
    ;

exprres : appelfonc
    | 'nil'
    | '(' expr ')'
    | 'non' expr
    | '-' exprres
    | multipleexprcomp
    | FLOAT
    | DOUBLE
    | INTEGER
    | STRING
    | booleen
    | IDF
    ;

multipleexprcomp : '°' (foncargs)? '°'
    ;

pmo : '-' | '+' | 'ou' ;
mde : '*' | '/' | 'mod' | 'quo' | 'et' ;
boolop : '<=' | '>=' | '!=' | '=' | '>' | '<' ;
booleen : 'true' | 'false' ;

STRING : '"' .*? '"' ;
INTEGER : [0-9]+ ;
DOUBLE : (INTEGER)?'.'INTEGER ;
FLOAT : DOUBLE'f' ;
FILENAME : [a-zA-Z0-9_]+ ;
IDF : [a-zA-Z_][a-zA-Z0-9_]* ;
TYPE : [a-zA-Z][a-zA-Z0-9]* ;
WS : ('\n'+ | '\t'+ | ' '+ | '\r'+) -> skip ;