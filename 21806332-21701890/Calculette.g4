grammar Calculette;

@members {
    private TablesSymboles tablesSymboles = new TablesSymboles();
    private int _cur_label = 1;
    /** générateur de nom d'étiquettes pour les boucles */
    private String getNewLabel() { return "B" +(_cur_label++); }

    private String operateurComp(String op){
        if(op.equals("==")){return op = " EQUAL";}
        else if(op.equals("<")){return op = " INF";}
        else if(op.equals(">")){return op = " SUP";}
        else if(op.equals(">=")){return op = " SUPEQ";}
        else if(op.equals("<=")){return op = " INFEQ";}
        return op=" NEQ";
    }

}

start: a = calcul EOF;

calcul
	returns[ String code ]
	@init { $code = new String(); }
// On initialise code, pour ensuite l'utiliser comme accumulateur
	@after { System.out.println($code); }: (decl { $code += $decl.code; })* NEWLINE* (
		instruction { $code += $instruction.code; }
	)* { $code += "  HALT\n"; };

decl
	returns[ String code ]:
	TYPE IDENTIFIANT {
            tablesSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
            if($TYPE.text.equals("int")){$code = "PUSHI " + "0" + "\n";}
            if($TYPE.text.equals("float")){$code = "PUSHF " + "0.0" + "\n";}
        } finInstruction
	| TYPE IDENTIFIANT '=' expression finInstruction {
            tablesSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
            $code = $expression.code;
    };

assignation
	returns[ String code ]:
	IDENTIFIANT '=' expression {  
            AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
            $code = $expression.code + "STOREG " + at.adresse + "\n";

        };

instruction
	returns[ String code ]:
	expression finInstruction { 
            $code = $expression.code; 
        }
	| assignation finInstruction {
            $code = $assignation.code;
        }
	| input finInstruction {
            $code = $input.code;
        }
	| print finInstruction {
            $code = $print.code;
        }
	| tantque finInstruction? {
            $code = $tantque.code;
        }
	| bloc finInstruction?{
            $code = $bloc.code;
        }
	| condition finInstruction {
            $code = $condition.code;
        }
	|si finInstruction{
            $code = $si.code;
    }
    | finInstruction {
        $code = "";
    };

expression
	returns[ String code ]:
	'(' expression ')' {$code = $expression.code;}
	| a = expression op = ('*' | '/') b = expression {
        if($op.text.equals("*")){$code = $a.code + $b.code + "MUL\n";}
        else{$code = $a.code + $b.code + "DIV\n";}
        }
	| c = expression op2 = ('+' | '-') d = expression {
        if($op2.text.equals("+")){$code = $c.code + $d.code + "ADD\n";}
        else{$code = $c.code + $d.code + "SUB\n";}
        }
	| ENTIER {
        $code = "  PUSHI " + $ENTIER.text + "\n";
    }
	| '-' ENTIER {
        $code = "  PUSHI -" + $ENTIER.text + "\n";
    }
	| IDENTIFIANT {
		AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
        $code = "  PUSHG " + at.adresse + "\n";
        };

input
	returns[String code]:
	'read' '(' IDENTIFIANT ')' {
        AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
        $code =  " READ \n";
        $code += " STOREG " + at.adresse + "\n";  
    };

print
	returns[String code]:
	'write' '(' expression ')' {
        $code = $expression.code;
        $code += " WRITE \n  POP\n";
    };

condition
	returns[String code]:
	a = expression OP b = expression { $code = $a.code + $b.code + operateurComp($OP.text) + "\n";}
    | c = condition '&&' d = condition { $code = $c.code + $d.code + "MUL \n";}
    | e = condition '||' f = condition { $code = $e.code + $f.code + "ADD \n PUSHI 0 \n SUP \n";}
    | '!' condition { $code = $condition.code + "PUSHI 1 \n" + "NEQ" + "\n";}
    | 'true' { $code = "  PUSHI 1\n"; }
	| 'false' { $code = "  PUSHI 0\n"; };	
       

tantque
	returns[String code]:
	'while' '(' condition ')' NEWLINE? instruction {
        String boucleIn = getNewLabel();
        String boucleOut = getNewLabel();

        $code = "LABEL " + boucleIn +"\n";

        $code += $condition.code;
        $code += "JUMPF " + boucleOut + "\n";
        $code += $instruction.code;
        $code += "JUMP " + boucleIn+"\n";


        $code += "LABEL " + boucleOut + "\n";
    
    };
    
si 
    returns[String code]:
    'if' '(' condition ')' NEWLINE? a = instruction {
        String IfOut = getNewLabel();
        String Else = getNewLabel();
        
        $code = $condition.code +"JUMPF" + Else +"\n";  
    
        $code += $a.code;
        $code += "JUMP" + IfOut+"\n";

        $code += "LABEL" + Else + "\n";
    }
    ('else' b = instruction{
        $code = $b.code + "\n";
        } 
    )?
    
    {$code += "LABEL" + IfOut + "\n";};
    

bloc
	returns[String code]
	: {$code = "";}
	'{' NEWLINE? (
		instruction {
        $code += $instruction.code + "\n";
  }
	)* NEWLINE? '}';

// lexer
NEWLINE: '\r'? '\n';
finInstruction: ( NEWLINE | ';')+;

TYPE: 'int' | 'float';

IDENTIFIANT: ('a' ..'z' | 'A' ..'Z' | '_') (
		'a' ..'z'
		| 'A' ..'Z'
		| '_'
		| '0' ..'9'
	)*;

ENTIER: ('0' ..'9')+;

OP: (
		'=='
		| '>'
		| '<'
		| '<='
		| '>='
		| '!='
		| '<>'
		| '||'
		| '&&'
		| '!'
	);

WS: (' ' | '\t')+ -> skip;

UNMATCH: . -> skip;
COMMENTAIRE: ('/*' .*? '*/' | '//' .*? NEWLINE) -> skip;

