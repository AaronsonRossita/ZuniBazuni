package design_patterns.builder;

public class House {

    private boolean basement;
    private String roof;
    private int windows;
    private int doors;

    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "I'm a house and I have " + windows + " windows" +
                " and " + doors + " doors";
    }
}
