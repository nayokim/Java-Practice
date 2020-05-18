package Animal;

public class Dog extends HousePets {

    public Dog(String firstName,  String speak) {
        super(firstName, speak);
    }

    public String getSpeak(){
        return "woof woof";
    }

    public Boolean hasEaten(){
        System.out.println("woof woof woof woof - Doggo is full!");
        return true;
    }

    public Boolean hasNotEaten(){
        System.out.println("bark bark");
        return false;
    }


}
