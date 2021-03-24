Machine Virtuelle à Pile (MVàP)
================================

Contenu
--------

Fichier 		   | Description					   |
-------------------------  | ----------------------------------------------------- |
add.mvap		   | Un exemple simple de programme                        |
3n+2.mvap		   | Un exemple moins simple de programme                  |
test.mvap		   | Un exemple avec appel de fonction                     |
MVaP.g4 		   | Le parser du langage qui produit un analyseur ANTLR4  |
MVaPAssemblerListener.java | Méthode appelée par le parcours de l'arbre d'analyse \
                                                  qui produit du code binaire (CB) |
MVaPAssembler.java	   | L'assembleur qui produit du code binaire              |
Pile.java		   | Un gestionnaire de pile d'entiers                     |
CBaP.java		   | La machine virtuelle pour le code binaire à pile      |

Compilation
------------

Pour compiler l'assembleur et le machine virtuelle, il faut :

1. Avoir antlr dans son CLASSPATH :

	- soit le fichier `antlr4-complete.jar` seul
	- soit les fichiers dans le répertoire contenant `antlr4-runtime.jar`


```
 	$ export CLASSPATH=.:"/usr/share/java/*":$CLASSPATH
```
     ou ajouter aux commandes : `-cp ".:/usr/share/java/*"` ou  `-cp ".:/path/to/antlr4-complete.jar` suivant la méthode utilisée pour installer antlr


2. Lancer antlr sur MVaP.g4
```
	$ java org.antlr.v4.Tool MVaP.g4
```

3. Compiler l'assembleur et la machine virtuelle (il suffit de demander la
     compilation des fichiers contenant les main, javac compilera les autres
     classes automatiquement...) 
```
	$ javac MVaPAssembler.java CBaP.java
```

Exécution
----------

Pour exécuter du code mvap, il faut :

1. Assembler :
```
 $ java MVaPAssembler add.mvap
```
     ou avec des traces :
```
 $ java MVaPAssembler -d add.mvap
```
     ce qui produit le fichier `add.mvap.cbap`

2. Exécuter :
```
 $ java CBaP add.mvap.cbap
```
     ou pour mieux comprendre avec des traces :
```
 $ java CBaP -d add.mvap.cbap
``` 

Utiliser la MVàP via le jar
=========================================

Construction du jar (à la main)
--------------------------------

Pour construire le jar, il faut :

1. avoir un `META-INF/MANIFEST` pour inclure le jar antlr dans le `CLASSPATH`
```
Manifest-Version: 1.0
Version: 3.0
Main-Class: CBaP
Class-Path: "/usr/share/java/*"
```

2. Compiler l’ensemble des fichiers

3. Contruire le jar avec :
```
 $ jar cfm MVaP.jar META-INF/MANIFEST *.class
```

Construction du jar (Makefile)
-------------------------------

On peut aussi faire tout simplement :
```
 $ make
```

Utilisation du jar 
-------------------

1. Assembler :
```
 $ java -cp "/usr/share/java/*:MVaP.jar" MVaPAssembler add.mvap
```

2. Exécuter :
```
 $ java -jar MVaP.jar -d add.mvap.cbap
```
