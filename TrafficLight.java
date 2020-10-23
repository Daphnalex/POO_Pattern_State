public class TrafficLight extends Observable{
    /**
        @param
        Color of the traffic light
     */
    private String currentColor;
    /**
        Constructor of the class "TrafficLight" : allow to create an object traffic light.
        The constructor has a string paramater : a variable "color";
     */
    public TrafficLight(String color){
        switch(color){
            case "VERT":
            case "ORANGE":
            case "ROUGE":
                this.currentColor = color;
                break;
            default: System.out.println("La couleur indiquée n'est pas une couleur de feu de signalisation");
        }
    }
    /**
        @return color of the traffic light
     */
    public String getColor(){
        return this.currentColor;
    }

    /**
        Method to change the color of the traffic light.
        Take the parameter color.
     */
    public void changeColor(String color){
        this.currentColor = color;
        this.notifyObserver(this);
    }


}