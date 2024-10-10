package CSC305_Lab_2.Lab2_Part1;

class Award {
    private final String name;
    private final int year;

    Award(String name, int year) {
        this.name = name;
        this.year = year;
    }

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
