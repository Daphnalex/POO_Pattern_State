public class Car implements Observer {

    private String name;
    private ControllerCar controller;

    public Car(String newName){
        this.name = newName;
        this.controller = new ControllerCar(this, new StopCarState());
    }

    public Car(String name, State state){
        this(name);
        this.controller = new ControllerCar(this, state);
    }

    public ControllerCar getController(){
        return this.controller;
    }

    public String getName(){
        return this.name;
    }

     public void repair(){
         this.controller.getCurrentState().repairCar(this.controller);
    }

    public void boost(){
       this.controller.getCurrentState().boostCar(this.controller);
    }

    public void notifications(String color){
        if (color.equals("VERT")) { 
            this.controller.getCurrentState().startCar(this.controller);
        }
        else if(color.equals("ORANGE") || color.equals("ROUGE")){
            this.controller.getCurrentState().stopCar(this.controller);
        }
        else {
            System.out.println("La couleur notifiée ne correspond pas à une couleur de feu tricolore");
        }
    };

}