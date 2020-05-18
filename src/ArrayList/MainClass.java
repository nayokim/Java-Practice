package ArrayList;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        //common methods when working with arrayLists
        numbers.add(20);// adding an element
        numbers.add(1,19);// adding 20 at index 0;
        numbers.add(0,21);
        System.out.println(numbers); //[20,20]

        //getting the size - returns the number of elements in the array
        System.out.println(numbers.size());

        //getting a specific element in a specific index;
        System.out.println(numbers.get(0));

        //return the first found index of the given item or -1 if not found
        System.out.println(numbers.indexOf("nayo"));
        System.out.println(numbers.indexOf(19));

        //define arraylist
        ArrayList<String> roast = new ArrayList<>();
        roast.add("light");
        roast.add("medium");
        roast.add("dark");

        System.out.println(roast); // prints [ light, medium, dark]

        //using .contains
        System.out.println(roast.contains("light"));
        System.out.println(roast.contains("Dark"));

        //.lastindexof - find the last index of the given element.
        System.out.println(roast.lastIndexOf("medium"));

        System.out.println(roast.isEmpty());

        









    }
}
