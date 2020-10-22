public class Executable {
    public static void main(String[] args){
        TrafficLight feu1 = new TrafficLight("ROUGE");
        Car voiture1 = new Car("Voiture1");
        Car voiture2 = new Car("Voiture2");
        Car voiture3 = new Car("Voiture3");
        feu1.addObserver(voiture1);
        feu1.addObserver(voiture2);
        feu1.addObserver(voiture3);
        System.out.println("\nLe feu passe au vert");
        feu1.changeColor("VERT");
        System.out.println("\nVoiture1 accélère");
        voiture1.boost();
        System.out.println("\nLe feu passe au rouge");
        feu1.changeColor("ROUGE");
        System.out.println("\nVoiture1 va au garage.");
        voiture1.repair();
        System.out.println("\nVoiture2 accélère");
        voiture2.boost();
        System.out.println("\nLe feu passe au vert");
        feu1.changeColor("VERT");
        TrafficLight feu2 = new TrafficLight("ROUGE");
        System.out.println("\nLe feu piéton est rouge");
        Pedestrian pieton1 = new RespectfulPedestrian("Pieton1");
        Pedestrian pieton2 = new DisrespecfulPedestrian("Pieton2");
        feu2.addObserver(pieton1);
        feu2.addObserver(pieton2);
        System.out.println("Les piétons vont ils traverser au feu rouge ?");
        System.out.println(pieton1);
        System.out.println(pieton1.getName() + pieton1.tryToCross());
        System.out.println(pieton2);
        System.out.println(pieton2.getName() + pieton2.tryToCross());
    }
}