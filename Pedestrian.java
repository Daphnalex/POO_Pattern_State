public class Pedestrian implements Observer{
    /**
        @param
        Name of current pedestrian
     */
    private String name;
     /**
        @param
        Link with the class CrossRoad
     */
    private  CrossRoad crossRoad;
    /**
        Get the name of current pedestrian
        @return String
    */
    public String getName(){
        return this.name;
    }
    /**
        Change the name of the current pedestrian
    */
    public void setName(String newName){
        this.name = newName;
    }
    /**
        Call the tryToCross function
        @see tryToCross()
    */
    public void notifications(String color){
        if (color.equals("ROUGE")) this.tryToCross();
    }
    /**
        Call function walk() to the CrossRoad class.
        @return message
        @see CrossRoad
    */
    public String tryToCross(){
        return this.crossRoad.walk();
    }
    /**
        Get the variable crossRoad 
        @return String
    */
    public CrossRoad getCrossRoad(){
        return this.crossRoad;
    }
    /**
        Change the variable crossRoad
    */
    public void setCrossRoad(CrossRoad newCross){
        this.crossRoad = newCross;
    }

}