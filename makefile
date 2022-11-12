JC = javac

JFLAGS  = -g -Wall

JCFLAGS = -g
CLASSDIR = classes

default: ResponseTracker.class

McQuestionLoader.class: McQuestionLoader.java
		$(JC) $(JCFLAGS) -d $(CLASSDIR) McQuestionLoader.java

ResponseTracker.class: ResponseTracker.java
		$(JC) $(JCFLAGS) -d $(CLASSDIR) ResponseTracker.java

McQuestion.class: McQuestion.java
		$(JC) $(JCFLAGS) -d $(CLASSDIR) McQuestion.java
		
run:
		java -cp $(CLASSDIR) ResponseTracker
		$(MAKE) clean

clean:
		$(RM) $(CLASSDIR)/*.class
