package abstractThing;

abstract class Phone {

    private int number;
    private String model;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    abstract void text();

    public static void call(){
        System.out.println("calling");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
