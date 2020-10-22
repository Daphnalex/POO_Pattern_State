public interface CrossRoad{
    
    public String walk();

}

class WalkRedLightTraffic implements CrossRoad{

    public String walk(){
        return " traverse la route malgré que le feu soit rouge";
    }

}

class NotWalkRedLightTraffic implements CrossRoad{
    
    public String walk(){
        return " ne traverse pas la route au feu rouge";
    }

}