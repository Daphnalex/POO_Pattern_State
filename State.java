public interface State {

    public void startCar(ControllerCar controller);

    public void stopCar(ControllerCar controller);

    public void boostCar(ControllerCar controller);

    public void brokenCar(ControllerCar controller);

    public void repairCar(ControllerCar controller);

}