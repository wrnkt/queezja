import java.util.Arrays;
import java.util.ArrayList;

class McQuestion extends Question
{

    private final String questionPrompt;
    private final ArrayList<String> possibleAnswers;
    private final int[] correctAnswerIdx;

    public McQuestion(String questionPrompt, ArrayList<String> possibleAnswers, int... correctAnswerIdx)
            throws IllegalArgumentException
    {

        this.questionPrompt = questionPrompt;
        this.possibleAnswers = possibleAnswers;
        for (int i: correctAnswerIdx)
        {
            if (i > (possibleAnswers.size() - 1))
                throw new IllegalArgumentException("correctAnswerIdx is not in the range of possible answers.");
        }
        this.correctAnswerIdx = correctAnswerIdx;
    }

    public String getQuestionPrompt()
    {
        return questionPrompt;
    }

    public ArrayList<String> getPossibleAnswersArrayList()
    {
        ArrayList<String> returnArrayList = possibleAnswers;
        return returnArrayList;
    }

    public String getAnswerByIdx(int index)
    {
        char answerPrefix = 'a';
        return (char)(answerPrefix + index) + ") " + possibleAnswers.get(index);
    }

    public String getPossibleAnswers()
    {
        String answerList = "";
        for(int i = 0; i < possibleAnswers.size(); i++)
        {
            answerList += getAnswerByIdx(i) + '\n';
        }
        return answerList;
    }

    public int[] getCorrectAnswerIdx()
    {
        return correctAnswerIdx;
    }

    public boolean isCorrectAnswer(int index)
    {
        return Arrays.asList(correctAnswerIdx).contains(index);
    }

    public ArrayList<String> getCorrectAnswers()
    {
        ArrayList<String> answers = new ArrayList<String>();
        for (int i: correctAnswerIdx)
        {
            answers.add(getAnswerByIdx(i));
        }
        return answers;
    }

    public String getPromptAndAnswers()
    {
        return getQuestionPrompt() + "\n" + getPossibleAnswers();
    }

    public static void main(String[] args)
    {
        /*
        String testPrompt = "Test question:";
        ArrayList<String> testAnswers = new ArrayList<>(Arrays.asList("answer 1", "answer 2", "answer 3", "answer 4", "answer 5"));
        McQuestion testQuestion = new McQuestion(testPrompt, testAnswers, 1);
        log(testQuestion.getPromptAndAnswers());
        */
    }

}
