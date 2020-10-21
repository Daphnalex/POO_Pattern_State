public class BrokenCarState implements State {

    public void startCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " est cassée et ne peut pas démarrer.");
    };

     public void stopCar(ControllerCar controller){
         System.out.println(controller.getCurrentCar().getName() + " est déjà arrêtée puisqu'elle est cassée.");
     };

    public void boostCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " ne peut pas passer en mode boost puisqu'elle est cassée.");
    };

    public void brokenCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " est déjà cassée.");
    };

    public void repairCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " est réparée.");
        controller.changeState(new StopCarState());
    };
}