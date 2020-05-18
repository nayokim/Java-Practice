package Animal;

public class Penguin {
    String firstName;
    Boolean hasEaten;
    Boolean doesDance;
    byte age;

    public Penguin(String firstName, Boolean doesDance,byte age){
        this.firstName=firstName;
        this.doesDance = doesDance;
        this.age = age;
    }

    public boolean hasEaten(){
        System.out.println("this penguin " + this.firstName + " has eaten."  );
        return hasEaten = true;
    }

    public boolean hasNotEaten(){
        System.out.println("this penguin " + this.firstName + " has not eaten. Please feed him. "  );
        return hasEaten = false;
    }


}
