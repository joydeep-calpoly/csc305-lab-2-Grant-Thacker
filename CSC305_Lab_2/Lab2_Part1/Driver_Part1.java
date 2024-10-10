package CSC305_Lab_2.Lab2_Part1;

import java.util.ArrayList;

public class Driver_Part1 {
    public static void main(String[] args) {
        try {
            ArrayList<Dignitary> people = new ArrayList<>();

            people.add(FileParser.createPersonFromFile("CSC305_Lab_2/input1.json"));
            people.add(FileParser.createPersonFromFile("CSC305_Lab_2/input2.json"));
            people.add(FileParser.createPersonFromFile("CSC305_Lab_2/input3.json"));

            for (Dignitary person : people) {
                System.out.println(person);
            }
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
