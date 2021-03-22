SET CLASSPATH=.;lib\antlr.jar;%CLASSPATH%
DOSKEY antlr=java org.antlr.v4.Tool $*
DOSKEY antlr-compile=javac *.java
DOSKEY grun=java org.antlr.v4.gui.TestRig $*
DOSKEY antlr4-grun=java org.antlr.v4.runtime.misc.TestRig $*