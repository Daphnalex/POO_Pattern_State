public class StopCarState implements State {

    public void startCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " démarre.");
        controller.changeState(new StartCarState());
    };

     public void stopCar(ControllerCar controller){
         System.out.println(controller.getCurrentCar().getName() + " est déjà arrêtée.");
     };

    public void boostCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " ne peut pas être booster depuis l'arrêt. Elle est cassée.");
        controller.changeState(new BrokenCarState());
    };

    public void brokenCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " est cassée. Sans doute une fuite d'huile !");
        controller.changeState(new BrokenCarState());
    };

    public void repairCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " n'est pas cassée. Elle n'a pas besoin d'être réparée.");
    };
}