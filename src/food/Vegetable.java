package food;

public class Vegetable extends Food {

    private String nameOfVeggie;

    public Vegetable(String type, boolean availability) {
        super(type, availability);
    }

    public String getNameOfVeggie() {
        return nameOfVeggie;
    }

    public void setNameOfVeggie(String nameOfVeggie) {
        this.nameOfVeggie = nameOfVeggie;
    }
}
