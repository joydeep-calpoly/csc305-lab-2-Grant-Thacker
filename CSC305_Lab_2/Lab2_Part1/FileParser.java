package Lab2_Part1;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileParser {
    public static Dignitary createPersonFromFile(String filePath) throws Exception {

        try {
            String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONObject fileIn = new JSONObject(fileContent);
            String name = fileIn.getString("name");
            Dignitary person = new Dignitary(name);
            JSONArray awards = fileIn.getJSONArray("awards");

            for (int i = 0; i < awards.length(); i++) {
                JSONObject award = awards.getJSONObject(i);
                String awardName = award.getString("name");
                int awardYear = award.getInt("year");
                Award currentAward = new Award(awardName, awardYear);
                person.addAward(currentAward);
            }

            JSONArray knownFors = fileIn.getJSONArray("knownFor");

            for (int i = 0; i < knownFors.length(); i++) {
                person.addKnownFor(knownFors.getString(i));
            }
            return person;
        }
        //if file is not found
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        //if other error occurs
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return new Dignitary("none");
    }
}
