public interface CrossRoad{
    /**
        @return a message if the pedestrian walk or not to the red traffic's light
     */
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