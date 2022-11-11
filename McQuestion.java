import java.util.Arrays;

class McQuestion implements Question {
    private final String questionPrompt;
    private final String[] possibleAnswers;
    private final int[] correctAnswerIdx;

    public McQuestion(String questionPrompt, String[] possibleAnswers, int[] correctAnswerIdx) {
        this.questionPrompt = questionPrompt;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswerIdx = correctAnswerIdx;
    }

    public String getQuestionPrompt() {
        return questionPrompt;
    }

    public String getAnswerByIdx(int index) {
        char answerPrefix = 'a';
        return (char)(answerPrefix + index) + ") " + possibleAnswers[index];
    }

    public boolean isCorrectAnswer(int index) {
        return Arrays.asList(correctAnswerIdx).contains(index);
    }

    public String getPossibleAnswers() {
        String answerList = "";
        for(int i = 0; i < possibleAnswers.length; i++) {
            answerList += getAnswerByIdx(i) + '\n';
        }
        return answerList;
    }

    public int[] getCorrectAnswerIdx() {
        return correctAnswerIdx;
    }

    public static void main(String[] args) {
        String testPrompt = "Test question:";
        String[] testAnswers = {"answer 1", "answer 2", "answer 3", "answer 4", "answer 5"};
        int[] correctAnswerIdx = {0};
        McQuestion testQuestion = new McQuestion(testPrompt, testAnswers, correctAnswerIdx);
        log(testQuestion.getQuestionPrompt());
        log(testQuestion.getPossibleAnswers());
    }

    public static void log(String s) {
        System.out.println(s);
    }

}
