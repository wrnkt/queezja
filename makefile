JC = javac

JFLAGS  = -g -Wall

JCFLAGS = -g -Xlint:unchecked

CLASSDIR = classes
CLASSPATH = .:./classes:./jsonclasses

default: LocalSessionManager.class

Analyzer.class: Analyzer.java
	$(JC) $(JCFLAGS) -classpath $(CLASSPATH) -d $(CLASSDIR) Analyzer.java

LocalSessionManager.class: LocalSessionManager.java Questioner.class McQuestionLoader.class McQuestion.class
	$(JC) $(JCFLAGS) -classpath $(CLASSPATH) -d $(CLASSDIR) LocalSessionManager.java

Questioner.class: Questioner.java ResponseTracker.class
	$(JC) $(JCFLAGS) -classpath $(CLASSPATH) -d $(CLASSDIR) Questioner.java

ResponseTracker.class: ResponseTracker.java McQuestion.class
	$(JC) $(JCFLAGS) -classpath $(CLASSPATH) -d $(CLASSDIR) ResponseTracker.java

McQuestionLoader.class: McQuestionLoader.java McQuestion.class
	$(JC) $(JCFLAGS) -classpath $(CLASSPATH) -d $(CLASSDIR) McQuestionLoader.java

McQuestion.class: McQuestion.java
	$(JC) $(JCFLAGS) -classpath $(CLASSPATH) -d $(CLASSDIR) McQuestion.java
		
run:
	java -classpath $(CLASSPATH) LocalSessionManager
		$(MAKE) clean

clean:
		$(RM) $(CLASSDIR)/*.class
