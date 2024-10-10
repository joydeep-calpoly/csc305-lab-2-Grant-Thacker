package CSC305_Lab_2.Lab2_Part1;

import java.util.ArrayList;
import java.util.List;

class Dignitary {
    private final String name;
    private final List<Award> awards;
    private final List<String> knownFor;

    Dignitary(String name, ArrayList<Award> award, ArrayList<String> knownFor) {
        this.name = name;
        this.awards = award;
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
