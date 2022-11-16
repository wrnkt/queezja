import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;


class McQuestionLoader extends QuestionLoader {

    public McQuestionLoader() {
    }
     
    public static String readFileToString(File f) throws FileNotFoundException, IOException {
        StringBuilder fileData = new StringBuilder();
        BufferedReader reader = new BufferedReader(
                new FileReader(f));
        char[] buffer = new char[1024];
        int numRead = 0;
        while((numRead = reader.read(buffer)) != -1) {
            String readData = String.valueOf(buffer, 0, numRead);
            fileData.append(readData);
        }
        reader.close();
        return fileData.toString();
    }

    public static ArrayList<McQuestion> loadFromTextFile(File f) throws FileNotFoundException {
        // TODO: implement load from text file
        try {
            String fileContent = readFileToString(f);
            JSONArray a = new JSONArray(fileContent);
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
        } catch (IOException e) {
            System.out.println("[ERROR]: Could not read file.");
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

        try {
            String fileContent = readFileToString(f);
            JSONArray a = new JSONArray(fileContent);
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
        } catch (IOException e) {
            System.out.println("[ERROR]: Could not read file.");
        }
        
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

    public static ArrayList<McQuestion> getQuestionSetFromQuestionSetFile(String path) throws FileNotFoundException {
        ArrayList<McQuestion> questionSet = new ArrayList<>();
        if (path.endsWith(".json")) {
            questionSet = loadFromJSON(new File(path));
        } else if (path.endsWith(".txt")) {
            questionSet = loadFromTextFile(new File(path));
        } else {
            // ERROR
            System.out.println("[ERROR]: Unsupported file format.");
        }
        return questionSet;
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
