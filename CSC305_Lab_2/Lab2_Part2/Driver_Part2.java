package CSC305_Lab_2.Lab2_Part2;

import java.io.IOException;
import java.util.ArrayList;

public class Driver_Part2 {
    public static void main(String[] args) {
        try {
            ArrayList<Dignitary> people = new ArrayList<>();
            
            people.add(FileParser.createPersonFromFile("CSC305_Lab_2/input1.json"));
            people.add(FileParser.createPersonFromFile("CSC305_Lab_2/input2.json"));
            people.add(FileParser.createPersonFromFile("CSC305_Lab_2/input3.json"));

            for (Dignitary p : people) {
                System.out.println(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
