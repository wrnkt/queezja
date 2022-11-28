import java.util.ArrayList;
import java.util.Arrays;

class Questioner
{

    private ResponseTracker[] trackerList;

    public Questioner(ArrayList<McQuestion> questionList)
    {
        loadQuestions(questionList);
    }

    public Questioner(McQuestion[] questionArray)
    {
        ArrayList<McQuestion> questionList = (ArrayList<McQuestion>) Arrays.asList(questionArray);
        loadQuestions(questionList);
    }

    public void loadQuestions(ArrayList<McQuestion> questionList)
    {
        ArrayList<ResponseTracker> trackerArrList = new ArrayList<ResponseTracker>();
        for(McQuestion q: questionList)
        {
            trackerArrList.add(new ResponseTracker(q));
        }
        this.trackerList = trackerArrList.toArray(new ResponseTracker[trackerArrList.size()]);
    }

    public void askQuestions()
    {
        for (ResponseTracker rt: trackerList)
        {
            rt.getResponse();
        }
    }

    public static void main(String[] args)
    {
    }

}
