public class Walker implements Observer,Deplacements{

    private String name;
    private  Behaviour behaviour;

    public Pieton(String name){
        this.name = name;
    };

    public String getName(){
        return this.name;
    }

    public void notifications(String color){
        
    }

    public void walk(String color){

    };
}