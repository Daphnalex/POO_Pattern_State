public class BoostCarState implements State {

    public void startCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " démarre très vite.");
        controller.changeState(new StartCarState());
    };

     public void stopCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " va trop vite. Elle grille le feu rouge et provoque un accident. Elle est maintenant cassée.");
        controller.changeState(new BrokenCarState());
     };

    public void boostCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " est déjà en mode boost.");
    };

    public void brokenCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " a trop forcé et s'est cassée.");
        controller.changeState(new BrokenCarState());
    };

    public void repairCar(ControllerCar controller){
        System.out.println(controller.getCurrentCar().getName() + " n'est pas cassée. Elle n'a pas besoin d'être réparée.");
    };
}