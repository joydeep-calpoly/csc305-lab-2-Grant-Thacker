package Lab2_Part1;

import java.util.ArrayList;
import java.util.List;

public class Dignitary {
    private final String name;
    private final List<Award> awards;
    private final List<String> knownFor;

    public Dignitary(String name) {
        this.name = name;
        this.awards = new ArrayList<>();
        this.knownFor = new ArrayList<>();
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

    public void addAward(Award award) {
        awards.add(award);
    }

    public void addKnownFor(String area) {
        knownFor.add(area);
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
