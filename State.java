public interface State {
    /**
        startCar() is a method for the class implemented by the class State.
        Change the state of the car to started state.
    */
    public void startCar(ControllerCar controller);
    /**
        stopCar() is a method for the class implemented by the class State.
        Change the state of the car to stopped state.
    */
    public void stopCar(ControllerCar controller);
    /**
        boostCar() is a method for the class implemented by the class State.
        Change the state of the car to boosted state.
    */
    public void boostCar(ControllerCar controller);
    /**
        brokenCar() is a method for the class implemented by the class State.
        Change the state of the car to broken state.
    */
    public void brokenCar(ControllerCar controller);
    /**
        repairCar() is a method for the class implemented by the class State.
        Change the state of the car to repaired state.
    */
    public void repairCar(ControllerCar controller);

}