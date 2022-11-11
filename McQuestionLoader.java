import java.io.File;
import java.io.FileNotFoundException;

class McQuestionLoader implements QuestionLoader {

    public McQuestionLoader() {
    }
     
    public static McQuestion loadFromTextFile(File f) throws FileNotFoundException {
        String[] answers = {"answer 1", "answer 2"};
        return new McQuestion("Test question", answers, 0);

    }

    public static McQuestion loadFromJSON(File f) throws FileNotFoundException {

        String[] answers = {"answer 1", "answer 2"};
        return new McQuestion("Test question", answers, 0);
    }

    public static void main(String[] args) {
        log("Testing McQuestionLoader");
        File loadFile = new File("loadfile.txt");
        try {
            McQuestion newQuestion = McQuestionLoader.loadFromTextFile(loadFile);
            log(newQuestion.getPromptAndAnswers());
        } catch (FileNotFoundException e) {
            log("File not found.");
        }
        
        log("-----------");
        
        
    }
    public static void log(String s) {
        System.out.println(s);

    }

}
