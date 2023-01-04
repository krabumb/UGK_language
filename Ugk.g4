grammar Ugk;

@header{
package parser;
}

ugk : (imports)? programme EOF ;

imports : (singleimport)+ ;

singleimport : 'importer' '<' filename '.ugk' '>' ;

programme : (fonction)* algorithme
    | (fonction)+
    ;

algorithme : 'algorithme' 'debut' algofoncblock 'fin'
    ;

fonction : 'fonction' type idf '(' (funcdecargs)? ')' 'debut' algofoncblock 'fin'
    ;

funcdecargs : type idf
    | type idf  (',' type idf)+
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

assignation : idf ':=' expr
    ;

si : siblock  ('sinon' siblock)*  ('sinon' block)? 'fsi'
    ;

siblock : 'si' expr 'alors' block
    ;

tantque : 'tant' 'que' expr 'faire' block 'ftant'
    ;

pour : 'pour' idf 'allant' 'de' expr 'vers' expr 'faire' block 'fpour'
    ;

appelfonc : idf '(' (foncargs)? ')'
    ;

foncargs : expr (',' expr)*
    ;

declaration : type idf (':=' expr)?
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
    | idf
    ;

multipleexprcomp : '°' (foncargs)? '°'
    ;

pmo : '-' | '+' | 'ou' ;
mde : '*' | '/' | 'mod' | 'quo' | 'et' ;
boolop : '<=' | '>=' | '!=' | '=' | '>' | '<' ;
booleen : 'true' | 'false' ;

idf : TYPE | IDF ;
filename : TYPE | IDF | FILENAME ;

STRING : '"' .*? '"' ;
INTEGER : [0-9]+ ;
DOUBLE : (INTEGER)? '.' INTEGER ;
FLOAT : DOUBLE 'f' ;
TYPE : [a-zA-Z][a-zA-Z0-9]* ;
IDF : [a-zA-Z_][a-zA-Z0-9_]* ;
FILENAME : [a-zA-Z0-9_]+ ;
WS : ('\n'+ | '\t'+ | ' '+ | '\r'+) -> skip ;