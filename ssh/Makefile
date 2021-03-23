CLASSPATH = ".:/usr/share/java/*:"
ANTLR4 = java -cp $(CLASSPATH) org.antlr.v4.Tool
JAVAC = javac -cp $(CLASSPATH)
CLASSES = Pile.class MVaPParser.class MVaPLexer.class MVaPAssemblerListener.class MVaPAssembler.class CBaP.class 

all : MVaP.jar

#MVaPParser.java : MVaP.g4 
%Parser.java : %.g4 
	$(ANTLR4) $<

%Lexer.java : %.g 
	$(ANTLR4) $<
 
#java org.antlr.Tool AssembleMVaP.g
$(CLASSES) : Pile.java MVaPParser.java MVaPLexer.java MVaPAssemblerListener.java MVaPAssembler.java CBaP.java
	$(JAVAC) *.java

MVaP.jar : $(CLASSES) 
	jar cfm MVaP.jar META-INF/MANIFEST.MF *.class

clean :
	rm -f *.class MVaPParser.java MVaPLexer.java MVaP.jar MVaPBaseListener.java *.tokens *.interp MVaPListener.java

sources :
	tar zcvf sources-MVaP-3.0.tgz ALIRE.md add.mvap 3n+2.mvap test.mvap MVaP.g4 Pile.java MVaPAssemblerListener.java MVaPAssembler.java CBaP.java META-INF/MANIFEST.MF Makefile
