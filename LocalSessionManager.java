import java.io.FileNotFoundException;
import java.io.File;

class LocalSessionManager {

    private static final Questioner q;
    private static final McQuestionLoader mcql;
    private Question[] questionSet;

    static {
        mcql = new McQuestionLoader();
        q = new Questioner();
    };

    public LocalSessionManager() {
    }

    // TODO: get a set of questions from a QuestionLoader
    public void loadQuestionSet(String path) throws FileNotFoundException {
        if (path.endsWith(".json")) {
            questionSet = mcql.loadFromJSON(new File(path));
        } else if (path.endsWith(".txt")) {
            questionSet = mcql.loadFromTextFile(new File(path));
        } else {
            // ERROR

        }
        q.loadQuestions(questionSet);
    }

    // TODO: get user question set/file input
    // path or file ?
    public static String getQuestionSet() {
        // call loadQuestionSet() here
        return new String("");

    }

    // TODO: load that set of questions into a Questioner
    // (that Questioner comes with an Analyzer)

    // TODO: prompt session beginning
    // TODO: allow choose a question set (file) (QuestionLoader func)


    public static void main(String[] args) {
        LocalSessionManager lsm = new LocalSessionManager();
        try {
        lsm.loadQuestionSet("loadfiles/testquestionset.json");
        } catch (FileNotFoundException e) {
        }

    }

}
