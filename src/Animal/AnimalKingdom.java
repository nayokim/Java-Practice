package Animal;

public class AnimalKingdom {

    public static void main (String [] args){

        HousePets husband = new HousePets("edward", "Hi");

        HousePets roundHead = new Cat("RoundHead", "meow");

        HousePets doggo = new Dog("doggie","woof");

        Penguin mumble = new Penguin("mumble", true, (byte) 5);

        System.out.println(husband.getSpeak());
        System.out.println(husband.hasEaten());
        System.out.println(roundHead.getSpeak());
        System.out.println(roundHead.hasEaten());
        System.out.println(doggo.getSpeak());
        System.out.println(doggo.hasEaten());
        System.out.println(mumble.hasEaten());
        System.out.println(mumble.hasNotEaten());


    }
}
