import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParse {
    private static final String filePath =
            "C:\\Users\\solnc\\IdeaProjects\\Project_JSON\\src\\main\\java\\JsonFile.json";

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader(filePath);

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            System.out.println(jsonObject);

//            JSONArray websites = (JSONArray) jsonObject.get("websites");
//            System.out.println(websites);
//
//            JSONObject structure = (JSONObject) jsonObject.get("amazon");
//            System.out.println(structure);
//
//            JSONArray books = (JSONArray) jsonObject.get("books");
//
//            String author = (String) jsonObject.get("author");
//            String bookTitle = (String) jsonObject.get("bookTitle");
//            System.out.println("The book title is: " + bookTitle + ", the author is " + author);
//
//            for (int i = 0; i < books.size(); i++) {
//                System.out.println("The " + i + " is element of array: " + books.get(i));
//            }
//            Iterator i = books.iterator();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }

//
}
