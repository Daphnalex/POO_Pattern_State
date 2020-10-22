public class Pedestrian implements Observer{

    private String name;
    private  CrossRoad crossRoad;

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void notifications(String color){
        if (color.equals("ROUGE")) this.tryToCross();
    }

    public String tryToCross(){
        return this.crossRoad.walk();
    }

    public CrossRoad getCrossRoad(){
        return this.crossRoad;
    }

    public void setCrossRoad(CrossRoad newCross){
        this.crossRoad = newCross;
    }

}