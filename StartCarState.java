public class StartCarState implements State {

    public void startCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " est déjà entrain de rouler.");
    };

     public void stopCar(ControllerCar controller){
         System.out.println(controller.getCurrentCar().getName() + " s'arrête.");
         controller.changeState(new StopCarState());
     };

    public void boostCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " roule très vite.");
        controller.changeState(new BoostCarState());
    };

    public void brokenCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " est cassée.");
        controller.changeState(new BrokenCarState());
    };

    public void repairCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " n'est pas cassée. Elle n'a pas besoin d'être réparée.");
    };
}