package observer;

public class Channel implements Observer {


    @Override
    public void update(double temp, int humidity) {
        System.out.println("Temperature : " + temp + "" +
                "\nHumidity : " + humidity + "%");
    }
}
