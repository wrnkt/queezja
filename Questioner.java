import java.util.ArrayList;

class Questioner
{

    private ResponseTracker[] trackerList;

    public Questioner()
    {
    }

    public Questioner(ArrayList<McQuestion> questionList)
    {
        ArrayList<ResponseTracker> trackerArrList = new ArrayList<ResponseTracker>();
        for(McQuestion q: questionList)
        {
            trackerArrList.add(new ResponseTracker(q));
        }
        this.trackerList = trackerArrList.toArray(new ResponseTracker[trackerArrList.size()]);
    }

    public Questioner(McQuestion[] questionList)
    {
        ArrayList<ResponseTracker> trackerArrList = new ArrayList<ResponseTracker>();
        for(McQuestion q: questionList)
        {
            trackerArrList.add(new ResponseTracker(q));
        }
        this.trackerList = trackerArrList.toArray(new ResponseTracker[trackerArrList.size()]);
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
