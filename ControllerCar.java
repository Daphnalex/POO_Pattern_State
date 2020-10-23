public class ControllerCar {
    /**
        @param
        State of current car
     */
    private State currentState;
    /**
        @param
        Current car
     */
    private Car currentCar;
    /**
        Constructor to create an object "ControllerCar".
        A controller car has a state and a car associated
     */
    public ControllerCar(Car car, State state){
        this.currentState = state;
        this.currentCar = car;
    }
    /**
        Function to change state of current car
     */
    public void changeState(State state){
        this.currentState = state;
    }
    /**
        @return the current state of the current car
     */
    public State getCurrentState(){
        return this.currentState;
    }
    /**
        @return the current car
     */
    public Car getCurrentCar(){
        return this.currentCar;
    }

}