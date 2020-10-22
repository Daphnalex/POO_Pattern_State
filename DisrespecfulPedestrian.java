public class DisrespecfulPedestrian extends Pedestrian {
    
    public DisrespecfulPedestrian(String newName){
        super();
        this.setCrossRoad(new WalkRedLightTraffic());
        this.setName(newName);
    }

    public String toString(){
        return this.getName() + " n'est pas respectueux du code de la route";
    }
    
}