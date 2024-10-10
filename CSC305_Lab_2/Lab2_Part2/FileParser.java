package Lab2_Part2;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class FileParser {
    public static Dignitary createPersonFromFile(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Dignitary dignitary = mapper.readValue(new File(filePath), Dignitary.class);

        Dignitary person = new Dignitary();
        person.setName(dignitary.getName());
        person.setKnownFor(dignitary.getKnownFor());
        person.setAwards(dignitary.getAwards());

        return person;
    }
}
