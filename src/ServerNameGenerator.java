import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {
            "Big",
            "Short",
            "Tall",
            "Fat",
            "Round",
            "Thin",
            "Small",
            "Rotund",
            "Cool",
            "Rad",
    };
    public static String[] nouns = {
            "Boy",
            "Girl",
            "Baby",
            "Dog",
            "Cat",
            "House",
            "Trees",
            "Egg",
            "Mouse",
            "Computer",
    };

    public static String getAdjectiveAndNouns(String[]arr){
        int randomAdjectiveOrNoun = (int)(Math.random() * ((arr.length - 1) + 1) + 1);
        return arr[randomAdjectiveOrNoun];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: \n"+getAdjectiveAndNouns (nouns) + "-" + getAdjectiveAndNouns(adjectives));
    }


}
