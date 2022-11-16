import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.File;

class LocalSessionManager {

    private final Questioner q;
    private final McQuestionLoader mcql;
    private ArrayList<McQuestion> questionSet;

    {
        mcql = new McQuestionLoader();
        q = new Questioner();
    };

    public LocalSessionManager() {
    }

    // TODO: get a set of questions from a QuestionLoader
    public void loadQuestionSet(String path) throws FileNotFoundException {
        questionSet = mcql.getQuestionSetFromQuestionSetFile(path);
        q.loadQuestions(questionSet);
    }

    public String getQuestionSet() {
        // TODO: prompt user for file path
        String filePath = "loadfiles/testquestionset.json";
        try {
            loadQuestionSet(filePath);
        } catch (FileNotFoundException e) {
            System.out.println(String.format("[ERROR]: %s not found.", filePath));
        }
        return new String("");
    }

    // TODO: load that set of questions into a Questioner
    // (that Questioner comes with an Analyzer)

    // TODO: allow choose a question set (file) (QuestionLoader func)
    // TODO: prompt session beginning

    public void startQuiz() {
        q.askQuestions();

    }


    public static void main(String[] args) {
        LocalSessionManager lsm = new LocalSessionManager();
        lsm.getQuestionSet();
        lsm.startQuiz();


    }

}
