public interface Behaviour{
    
    public String walk();

}

class WalkRedLightTraffic implements Behaviour{

    public String walk(){
        return "traverse la route malgré que le feu soit rouge";
    }

}

class NotWalkRedLightTraffic implements Behaviour{
    public String walk(){
        return "ne traverse pas la route au feu rouge";
    }
}