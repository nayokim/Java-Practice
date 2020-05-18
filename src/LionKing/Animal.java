package LionKing;

public class Animal {
    private String food;
    private Boolean hunger;
    private String location;
    private String sound;

    public Animal (String food, Boolean hunger, String location, String sound){
        this.food = food;
        this.hunger = hunger;
        this.location = location;
        this.sound = sound;
    }

    public String getFood(){
        return this.food;
    }

    public Boolean isHungry(){
        return hunger;
    }

    public String getLocation(){
        return this.location;
    }

    public String getSound(){
        return this.sound;
    }

}
