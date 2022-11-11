JC = javac

JFLAGS  = -g -Wall

JCFLAGS = -g
CLASSDIR = classes

default: McQuestion.class

McQuestionLoader.class: McQuestionLoader.java
		$(JC) $(JCFLAGS) -d $(CLASSDIR) McQuestionLoader.java

McQuestion.class: McQuestion.java
		$(JC) $(JCFLAGS) -d $(CLASSDIR) McQuestion.java
		
run:
		java -cp $(CLASSDIR) McQuestion
		$(MAKE) clean

clean:
		$(RM) $(CLASSDIR)/*.class
