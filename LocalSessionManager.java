import java.io.File;

class LocalSessionManager {

    private final Questioner q;
    private static final McQuestionLoader mcql;
    

    // XXX: should a SessionManager manage multiple local sessions?
    // probably not
    public LocalSessionManager() {
        McQuestionLoader mcql = new McQuestionLoader();
        try {
            Question[] questionSet = mcql.loadFromJSON(this.getQuestionSet());
        } catch (FileNotFoundException e) {
        }
        
        this.q = new Questioner(questionSet);
    }
    // TODO: get a set of questions from a QuestionLoader

    // TODO: load that set of questions into a Questioner
    // (that Questioner comes with an Analyzer)

    // TODO: prompt session beginning
    // TODO: allow choose a question set (file) (QuestionLoader func)
    public File getQuestionSet() {
        return new File("loadfiles/testquestionset.json");

    }


    public static void main(String[] args) {
        LocalSessionManager lsm = new LocalSessionManager();

    }

}
