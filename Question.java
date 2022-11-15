import java.util.ArrayList;

abstract class Question {
    private String questionPrompt;
    private ArrayList<String> possibleAnswers;
    private int[] correctAnswerIdx;

    public abstract String getQuestionPrompt();
    public abstract String getPossibleAnswers();
    public abstract String getPromptAndAnswers();
    public abstract String getAnswerByIdx(int index);

    public abstract ArrayList<String> getPossibleAnswersArrayList();

    public abstract int[] getCorrectAnswerIdx();
    public abstract boolean isCorrectAnswer(int index);
    public abstract ArrayList<String> getCorrectAnswers();

}
