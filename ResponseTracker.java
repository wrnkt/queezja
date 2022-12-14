import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class ResponseTracker
{

    private ArrayList<Integer> responses;
    private final McQuestion q;

    public ResponseTracker(McQuestion q)
    {
        this.q = q;
        this.responses = new ArrayList<Integer>();
    }

    public boolean isCorrectResponse(int index)
    {
        responses.add(index);
        if (q.isCorrectAnswer(index))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void getResponse()
    {
        Scanner responseScanner = new Scanner(System.in);

        System.out.println(q.getPromptAndAnswers());
        System.out.println("Enter your answer:");
        
        char rangeStart = 'a';
        char rangeEnd = (char) ((int) rangeStart + q.getPossibleAnswersArrayList().size() - 1);
        char response = '0';
        response = responseScanner.next().charAt(0);

        while (!((response >= rangeStart) && (response <= rangeEnd)))
        {
            System.out.println(String.format("Enter a letter %c - %c", rangeStart, rangeEnd));
            response = responseScanner.next().charAt(0);
        }
        int respIndex = (int) (response - rangeStart);

        if (isCorrectResponse(respIndex)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }
    }

    public static void main(String[] args)
    {
        String testPrompt = "Test question:";
        ArrayList<String> testAnswers = new ArrayList<>(Arrays.asList("answer 1", "answer 2", "answer 3", "answer 4", "answer 5"));
        McQuestion testQuestion = new McQuestion(testPrompt, testAnswers, 1);
        ResponseTracker testResponses = new ResponseTracker(testQuestion);
    }

}
