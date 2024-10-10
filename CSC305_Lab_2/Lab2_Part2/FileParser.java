package CSC305_Lab_2.Lab2_Part2;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class FileParser {
    public static Dignitary createPersonFromFile(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(filePath), Dignitary.class);
    }
}
