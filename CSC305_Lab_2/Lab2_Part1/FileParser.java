package CSC305_Lab_2.Lab2_Part1;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileParser {
    public static Dignitary createPersonFromFile(String filePath) {

        try {
            String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONObject fileIn = new JSONObject(fileContent);
            String name = fileIn.getString("name");
            JSONArray awards = fileIn.getJSONArray("awards");
            ArrayList<Award> awardsList = new ArrayList<>();
            for (int i = 0; i < awards.length(); i++) {
                JSONObject award = awards.getJSONObject(i);
                String awardName = award.getString("name");
                int awardYear = award.getInt("year");
                awardsList.add(new Award(awardName, awardYear));
            }

            JSONArray knownFors = fileIn.getJSONArray("knownFor");
            ArrayList<String> knownForList = new ArrayList<>();
            for (int i = 0; i < knownFors.length(); i++) {
                knownForList.add(knownFors.getString(i));
            }
            return new Dignitary(name, awardsList, knownForList);
        }
        //if file is not found
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        //if other error occurs
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return new Dignitary("none", new ArrayList<>(), new ArrayList<>());
    }
}
