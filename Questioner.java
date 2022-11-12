import java.util.ArrayList;

class Questioner {

    private ResponseTracker[] trackerList;

    public Questioner(ArrayList<Question> questionList) {
        ArrayList<ResponseTracker> trackerArrList = new ArrayList<ResponseTracker>();
        for(Question q: questionList) {
            trackerArrList.add(new ResponseTracker(q));
        }
        this.trackerList = trackerArrList.toArray(new ResponseTracker[trackerArrList.size()]);
    }

    public Questioner(Question[] questionList) {
        ArrayList<ResponseTracker> trackerArrList = new ArrayList<ResponseTracker>();
        for(Question q: questionList) {
            trackerArrList.add(new ResponseTracker(q));
        }
        this.trackerList = trackerArrList.toArray(new ResponseTracker[trackerArrList.size()]);
    }

    /*
    public Questioner(ArrayList<ResponseTracker> rt) {
       // Questioner(ArrayList<ResponseTracker>) and Questioner(ArrayList<Question>) have the same erasure 

       
    }
    */

    public static void main(String[] args) {
        log("test");

    }

    public static void log(String s) {
        // TODO: make separate log class with static method to avoid
        // repeating this over and over
        System.out.println(s);
    }

}
