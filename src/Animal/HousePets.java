package Animal;

public class HousePets {

    private int numberOfLegs;
    private boolean hasEaten;
    private String firstName;
    private String speak;

    public HousePets (String firstName,  String speak){
        this.firstName = firstName;
        this.speak = speak;
    }

    public String getSpeak(){
        return "hi wifey";
    }

    public Boolean hasEaten(){
        System.out.println("Husband has eaten. DO not feed him any cookies. He's lying to you");
        return true;
    }

    public Boolean hasNotEaten(){
        System.out.println("Feed cookies");
        return false;
    }



}
