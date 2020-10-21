public class Executable {
    public static void main(String[] args){
        TrafficLight feu1 = new TrafficLight("ORANGE");
        Car voiture1 = new Car("Voiture1");
        Car voiture2 = new Car("Voiture2");
        Car voiture3 = new Car("Voiture3");
        feu1.addObserver(voiture1);
        feu1.addObserver(voiture2);
        feu1.addObserver(voiture3);
        System.out.println("Le feu passe au vert");
        feu1.changeColor("VERT");
        System.out.println("Voiture1 accélère");
        voiture1.boost();
        System.out.println("Le feu passe au rouge");
        feu1.changeColor("ROUGE");
        System.out.println(voiture1.getController().getCurrentState());
        System.out.println("Voiture1 va au garage.");
        voiture1.repair();
    }
}