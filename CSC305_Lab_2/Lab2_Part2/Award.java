package CSC305_Lab_2.Lab2_Part2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Award {
    private final String name;
    private final int year;

    @JsonCreator
    Award(@JsonProperty("name") String name, @JsonProperty("year") int year) {
        this.name = name;
        this.year = year;
    }

    /*Award(String name, int year) {
        this.name = name;
        this.year = year;
    }*/

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return name;
    }
}
