public class RespectfulPedestrian extends Pedestrian {
    
    public RespectfulPedestrian(String name){
        this.setCrossRoad(new NotWalkRedLightTraffic());
        this.setName(name);
    }

    public String toString(){
        return this.getName() + " est respectueux du code de la route";
    }
}