package observer;

public class ObserverRunner {

    public static void main(String[] args) {

    WeatherStation weatherStation = new WeatherStation();

//    Channel channel1 = new Channel();
//    Channel channel2 = new Channel();
//    Channel channel3 = new Channel();

//    weatherStation.register(new Channel());
//    weatherStation.register(new Channel());
//    weatherStation.register(new Channel());

    Observer[] arr = {new Channel(), new Channel(), new Channel()};
    weatherStation.registerArray(arr);

    weatherStation.notifyObservers(23.0, 40);
    weatherStation.notifyObservers(25, 30);

    }

}
