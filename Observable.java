import java.util.ArrayList;

public abstract class Observable {

    /**
        @param
        list of observer object who watch the current observable object
     */
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    /**
        function to add an observer to observers list
     */
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    /**
        function to delete an observer to observers list
     */
    public void deleteObserver(Observer observer){
        this.observers.remove(observer);
    }
    /**
        function who notify an observer to observers list
     */
    public void notifyObserver(TrafficLight feu){
        for(Observer observer: this.observers){
            observer.notifications(feu.getColor());
        }
    }

}