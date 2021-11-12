package observer;

public interface Subject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers(double temp, int humidity);

}
