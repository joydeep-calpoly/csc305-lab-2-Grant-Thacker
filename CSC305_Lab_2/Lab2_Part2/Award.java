package Lab2_Part2;

public class Award {
    private String name;
    private int year;

    public Award(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Award() {
        this.name = "";
        this.year = -1;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return name;
    }
}
