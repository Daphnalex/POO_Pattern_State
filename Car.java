public class Car implements Observer {

    /**
        @param
        Name of current car
     */
    private String name;
    /**
        @param
        Controller of current car
     */
    private ControllerCar controller;

    /**
        Constructor of the class "Car" : allow to create an object "Car".
        A car has a name;
        By default the car is stopped
     */
    public Car(String newName){
        this.name = newName;
        this.controller = new ControllerCar(this, new StopCarState());
    }

    /**
        Constructor of the class "Car" : allow to change the state of the controller.
    */
    public Car(String name, State state){
        this(name);
        this.controller = new ControllerCar(this, state);
    }

    /**
        Get the controller of current car.
        @return ControllerCar
    */
    public ControllerCar getController(){
        return this.controller;
    }

    /**
        Get the name of current car.
        @return String
    */
    public String getName(){
        return this.name;
    }

    /**
        Call the method "repairCar" of ControllerCar class.
        @see ControllerCar
    */
    public void repair(){
         this.controller.getCurrentState().repairCar(this.controller);
    }

    /**
        Call the method "boostCar" of ControllerCar class.
        @see ControllerCar
    */
    public void boost(){
       this.controller.getCurrentState().boostCar(this.controller);
    }

    /**
        Alert the controller to changeState by differents methods according to the color of traffic light.
        @see ControllerCar
    */
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