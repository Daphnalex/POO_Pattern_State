public class DisrespecfulPedestrian extends Pedestrian {
    /**
        Constructor to create an object "DisrespecfulPedestrian".
        A disrepecfulPedestrian has a name and a crossRoad parameters
     */
    public DisrespecfulPedestrian(String newName){
        super();
        this.setCrossRoad(new WalkRedLightTraffic());
        this.setName(newName);
    }
    /**
       Function to display the disrespectfulPedestrian object 
     */
    public String toString(){
        return this.getName() + " n'est pas respectueux du code de la route";
    }
    
}