public class TrafficLight extends Observable{

    private String currentColor;

    public TrafficLight(String color){
        System.out.println("test couleur " + color);
        switch(color){
            case "VERT":
            case "ORANGE":
            case "ROUGE":
                this.currentColor = color;
                break;
            default: System.out.println("La couleur indiquée n'est pas une couleur de feu de signalisation");
        }
    }

    public String getColor(){
        return this.currentColor;
    }

    public void changeColor(String color){
        this.currentColor = color;
        this.notifyObserver(this);
    }


}