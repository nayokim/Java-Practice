package doggie;

public class DogTestDrive {
    public static void main(String[] args){
        Dog d = new Dog();
        //use dot operator to set the size of the dog
        d.size = 40;
        //to call its bark() method
        d.bark() ;

        //make dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        //make Dog array
        Dog [] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //access the Dogs using the array
        //references
        myDogs[0].name = "Fred";
        myDogs[1].name = "marge";

        //what is myDogs[2] name?
        System.out.println("last dog's name is: " + myDogs[2].name);

        //loop through the array and tell all dogs to bark
        int x = 0;

        while(x < myDogs.length){
            myDogs[x].bark();
            x= x + 1;
        }

        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 10;

        one.bark();
        two.bark();

        Dog[] pets = new Dog[7];
        pets[0] = new Dog();
        pets[1] = new Dog();

        pets[0].setSize(10);
        for (Dog doggie : pets){
            System.out.println(pets);
        }



    }

}
