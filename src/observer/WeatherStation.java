package observer;

import java.util.ArrayList;

public class WeatherStation implements Subject {

    private ArrayList<Observer> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        if (!observers.contains(o)){
            observers.add(o);
        }
    }

    public void registerArray(Observer[] arr){
        for (Observer o : arr){
            register(o);
        }
    }

    @Override
    public void unregister(Observer o) {
        if (observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers(double temp, int humidity) {
        for (Observer o : observers){
            o.update(temp, humidity);
        }
    }
}
