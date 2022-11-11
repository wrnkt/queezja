import java.util.Arrays;
import java.util.ArrayList;

class McQuestion implements Question {
    private final String questionPrompt;
    private final String[] possibleAnswers;
    private final int[] correctAnswerIdx;

    public McQuestion(String questionPrompt, String[] possibleAnswers, int... correctAnswerIdx) {
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

    public boolean isCorrectAnswer(int index) {
        return Arrays.asList(correctAnswerIdx).contains(index);
    }


    public String[] getCorrectAnswers() {
        ArrayList<String> answers = new ArrayList<String>();
        for (int i: correctAnswerIdx) {
            answers.add(getAnswerByIdx(i));
        }
        return answers.toArray(new String[0]);
    }

    public String getQuestionAndAnswers() {
        return getQuestionPrompt() + "\n" + getPossibleAnswers();

    }

    public static void main(String[] args) {
        String testPrompt = "Test question:";
        String[] testAnswers = {"answer 1", "answer 2", "answer 3", "answer 4", "answer 5"};
        McQuestion testQuestion = new McQuestion(testPrompt, testAnswers, 0);
        log(testQuestion.getQuestionAndAnswers());
        // log(Arrays.toString(testQuestion.getCorrectAnswers()));
    }

    public static void log(String s) {
        System.out.println(s);
    }
    

}