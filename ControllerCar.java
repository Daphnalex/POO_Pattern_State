public class ControllerCar {

    private State currentState;
    private Car currentCar;

    public ControllerCar(Car car, State state){
        this.currentState = state;
        this.currentCar = car;
    }

    public void changeState(State state){
        this.currentState = state;
    }

    public State getCurrentState(){
        return this.currentState;
    }

    public Car getCurrentCar(){
        return this.currentCar;
    }

}