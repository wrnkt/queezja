import java.util.Scanner;
import java.util.ArrayList;

class ResponseTracker {

    private ArrayList<Integer> responses;
    private final Question q;

    public ResponseTracker(Question q) {
        this.q = q;
    }

    public boolean isCorrectResponse(int index) {
        responses.add(index);
        if (q.isCorrectAnswer(index)) {
            return true;
        } else {
            return false;
        }
    }

    //public int[] getResponses();

    public static void main(String[] args) {
        String testPrompt = "Test question:";
        String[] testAnswers = {"answer 1", "answer 2", "answer 3", "answer 4", "answer 5"};
        McQuestion testQuestion = new McQuestion(testPrompt, testAnswers, 1);
        ResponseTracker testResponses = new ResponseTracker(testQuestion);

    }

    public static void log(String s) {
        System.out.println(s);
    }

}
