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

    {
        try {
            questionSet = mcql.loadFromJSON(getQuestionSet());
            q.loadQuestions(questionSet);
        } catch (FileNotFoundException e) {}
    };
    

    // XXX: should a SessionManager manage multiple local sessions?
    // probably not
    public LocalSessionManager() {
        
    }
    // TODO: get a set of questions from a QuestionLoader

    // TODO: load that set of questions into a Questioner
    // (that Questioner comes with an Analyzer)

    // TODO: prompt session beginning
    // TODO: allow choose a question set (file) (QuestionLoader func)
    public static File getQuestionSet() {
        return new File("loadfiles/testquestionset.json");

    }


    public static void main(String[] args) {
        LocalSessionManager lsm = new LocalSessionManager();

    }

}
