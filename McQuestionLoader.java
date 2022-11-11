import java.io.File;

class McQuestionLoader implements QuestionLoader {

    // McQuestionConstructor
    // public McQuestion(String questionPrompt, String[] possibleAnswers, int... correctAnswerIdx) {

    public McQuestionLoader() {
    }
     
    public static McQuestion loadSingleQuestion(File f) {
        String[] answers = {"answer 1", "answer 2"};
        return new McQuestion("Test question", answers, 0);

    }

    //public Question[] loadMultipleQuestion(File f);

    public static void main(String[] args) {
        log("Testing McQuestionLoader");
        File loadFile = new File("loadfile.txt");
        McQuestion newQuestion = McQuestionLoader.loadSingleQuestion(loadFile);
        log(newQuestion.getPromptAndAnswers());
        
        log("-----------");
        
        
    }
    public static void log(String s) {
        System.out.println(s);

    }

}
