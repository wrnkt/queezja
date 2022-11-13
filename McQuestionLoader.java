import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

class McQuestionLoader implements QuestionLoader {

    public McQuestionLoader() {
    }
     
    public static McQuestion[] loadFromTextFile(File f) throws FileNotFoundException {

        ArrayList<McQuestion> questionArrayList = new ArrayList<McQuestion>();
        String[] answers = {"answer 1", "answer 2"};
        McQuestion q1 = new McQuestion("Test question 1", answers, 0);
        McQuestion q2 = new McQuestion("Test question 2", answers, 0);
        McQuestion q3 = new McQuestion("Test question 3", answers, 0);
        questionArrayList.add(q1);
        questionArrayList.add(q2);
        questionArrayList.add(q3);
        return questionArrayList.toArray(new McQuestion[questionArrayList.size()]);

    }

    public static McQuestion[] loadFromJSON(File f) throws FileNotFoundException {

        ArrayList<McQuestion> questionArrayList = new ArrayList<McQuestion>();
        String[] answers = {"answer 1", "answer 2"};
        McQuestion q1 = new McQuestion("Test question 1", answers, 0);
        McQuestion q2 = new McQuestion("Test question 2", answers, 1);
        McQuestion q3 = new McQuestion("Test question 3", answers, 1);
        questionArrayList.add(q1);
        questionArrayList.add(q2);
        questionArrayList.add(q3);
        return questionArrayList.toArray(new McQuestion[questionArrayList.size()]);
    }

    public static void main(String[] args) {
        log("Testing McQuestionLoader");
        File loadFile = new File("loadfile.txt");
        /*
        try {
            for(Question newQuestion: 
            log(newQuestion.getPromptAndAnswers());
        } catch (FileNotFoundException e) {
            log("File not found.");
        }
        */
        
        log("-----------");
        
        
    }
    public static void log(String s) {
        System.out.println(s);

    }

}
