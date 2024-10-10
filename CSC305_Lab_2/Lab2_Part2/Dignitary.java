package CSC305_Lab_2.Lab2_Part2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Dignitary {
    private final String name;
    private final List<Award> awards;
    private final List<String> knownFor;

    @JsonCreator
    private Dignitary(@JsonProperty("name") String name, @JsonProperty("awards") List<Award> awards, @JsonProperty("knownFor") List<String> knownFor) {
        this.name = name;
        this.awards = awards;
        this.knownFor = knownFor;
    }

    public String getName() {
        return name;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public List<String> getKnownFor() {
        return knownFor;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder(name + "\n\n" + "Known For:\n");
        for (String s : knownFor) {
            ret.append("\t").append(s).append("\n");
        }
        ret.append("\nAwards:\n");
        for (Award award : awards) {
            ret.append("\t").append(award).append("\n");
        }
        return ret.toString();
    }
}
