import java.util.Arrays;


public class ArrayExercises {
    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static Person[] newPerson (Person[] newPeople, Person newPerson){
        Person [] newArray  = Arrays.copyOf(newPeople, newPeople.length+1);

        newArray[newArray.length - 1] = newPerson;
        return newArray;
    }
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person [] newPeople = new Person[3];
        newPeople[0] = new Person("Edward");
        newPeople[1] = new Person ("Nayoung");
        newPeople[2] = new Person ("Willa");

        for(Person people : newPeople){
            System.out.println(people.getName());
        }

        newPeople = (newPerson(newPeople, new Person("Fat face")));
        for (Person person : newPeople){
            System.out.println(person.getName());
        }

    }
}
