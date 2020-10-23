public class RespectfulPedestrian extends Pedestrian {
    /**
        Constructor to create an object "RespecfulPedestrian".
        A repecfulPedestrian has a name and a crossRoad parameters
     */
    public RespectfulPedestrian(String name){
        this.setCrossRoad(new NotWalkRedLightTraffic());
        this.setName(name);
    }
    /**
       Function to display the respectfulPedestrian object 
     */
    public String toString(){
        return this.getName() + " est respectueux du code de la route";
    }
}