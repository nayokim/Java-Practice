package Animal;

public class Cat extends HousePets {

    private String speak;

    public Cat (String firstName,String speak){
        super(firstName,speak);

    }

    public String getSpeak(){
        return "Meow Meow";
    }

    public Boolean hasEaten(){
        System.out.println("DO NOT FEED THE CAT! IT HAS ALREADY EATEN!");
        return true;
    }

    public Boolean hasNotEaten(){
        System.out.println("FEED THE CAT PLEASE!");
        return false;
    }





}
