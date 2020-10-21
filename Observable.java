import java.util.ArrayList;

public abstract class Observable {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObserver(TrafficLight feu){
        for(Observer observer: this.observers){
            observer.notifications(feu.getColor());
        }
    }

}