JC = javac

JFLAGS  = -g -Wall

JCFLAGS = -g -Xlint:unchecked
CLASSDIR = classes

default: LocalSessionManager.class

Analyzer.class: Analyzer.java
		$(JC) $(JCFLAGS) -d $(CLASSDIR) Analyzer.java

LocalSessionManager.class: LocalSessionManager.java
		$(JC) $(JCFLAGS) -d $(CLASSDIR) LocalSessionManager.java

Questioner.class: Questioner.java
		$(JC) $(JCFLAGS) -d $(CLASSDIR) Questioner.java

ResponseTracker.class: ResponseTracker.java
		$(JC) $(JCFLAGS) -d $(CLASSDIR) ResponseTracker.java

McQuestionLoader.class: McQuestionLoader.java
		$(JC) $(JCFLAGS) -d $(CLASSDIR) McQuestionLoader.java

McQuestion.class: McQuestion.java
		$(JC) $(JCFLAGS) -d $(CLASSDIR) McQuestion.java
		
run:
		java -cp $(CLASSDIR) LocalSessionManager
		$(MAKE) clean

clean:
		$(RM) $(CLASSDIR)/*.class
