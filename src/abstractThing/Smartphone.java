package abstractThing;

public class Smartphone extends Phone {


    public Smartphone(int number, String model) {
        super(number, model);
    }

    public void browse(){};

    public void media(){};



    @Override
    void text() {
        System.out.println("whatsapp or sms");
    }
}
