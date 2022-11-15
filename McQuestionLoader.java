import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

class McQuestionLoader extends QuestionLoader {

    public McQuestionLoader() {
    }
     
    public static ArrayList<McQuestion> loadFromTextFile(File f) throws FileNotFoundException {
        // TODO: implement load from text file
        JSONParser parser = new JSONParser();
        JSONArray a = (JSONArray) parser.parse(new FileReader("loadfiles/testquestionset.json"));

        for(Object o : a) {
            JSONObject question = (JSONObject) o;

            String prompt = (String) question.get("prompt");
            System.out.println(prompt);

            /*
            JSONArray choices = (JSONArray) question.get("choices");
            Iterator<String> choicesIterator = choices.iterator();
            while (choicesIterator.hasNext()) {
                     System.out.println(choicesIterator.next());
            }

            JSONArray answeridx = (JSONArray) question.get("answeridx");
            Iterator<String> idxIterator = answeridx.iterator();
            while (idxIterator.hasNext()) {
                     System.out.println(idxIterator.next());
            }
            */

        }

        ArrayList<McQuestion> questionArrayList = new ArrayList<McQuestion>();
        ArrayList<String> answers = new ArrayList<>(Arrays.asList("answer 1", "answer 2"));
        McQuestion q1 = new McQuestion("Test question 1", answers, 0);
        McQuestion q2 = new McQuestion("Test question 2", answers, 0);
        McQuestion q3 = new McQuestion("Test question 3", answers, 0);
        questionArrayList.add(q1);
        questionArrayList.add(q2);
        questionArrayList.add(q3);
        return questionArrayList;

    }

    // TODO: implement load from JSON file
    public static ArrayList<McQuestion> loadFromJSON(File f) throws FileNotFoundException {

        ArrayList<McQuestion> questionArrayList = new ArrayList<McQuestion>();
        ArrayList<String> answers = new ArrayList<>(Arrays.asList("answer 1", "answer 2"));
        McQuestion q1 = new McQuestion("Test question 1", answers, 0);
        McQuestion q2 = new McQuestion("Test question 2", answers, 1);
        McQuestion q3 = new McQuestion("Test question 3", answers, 1);
        questionArrayList.add(q1);
        questionArrayList.add(q2);
        questionArrayList.add(q3);
        return questionArrayList;
    }

    public static void main(String[] args) {
        log("Testing McQuestionLoader");
        File loadFile = new File("loadfile.txt");
        /*
        try {
            for(Question newQuestion: 
            log(newQuestion.getPromptAndAnswers());
        } catch (FileNotFoundException e) {
            log("File not found.");
        }
        */
        
        log("-----------");
        
        
    }
    public static void log(String s) {
        System.out.println(s);

    }

}
