import java.util.Arrays;
import java.util.Scanner;

public class JavaArray {
    public static void sumOfNumbersInArray(int[] array){
        System.out.println("the elements in the array are: ");
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
            sum = sum + array[i];
        }
//        for (int i : array){
//            sum += i;
//        }
        System.out.println(sum);
    }
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
//        int [] numbers = new int[4];
//        numbers[0] = 10;
//        numbers[1] = 9;
//        numbers[2] = 8;
//        numbers[3] = 7;
//
//        int index = 0;
//        while (index < numbers.length){
//            System.out.println(numbers[index]);
//            index++;
////        }
//        System.out.println("How many numbers?");
//        int howMany = Integer.parseInt(reader.nextLine());
//
//        int [] number = new int[howMany];// howMany input is how many elements are in the array
//        System.out.println("enter the numbers:");

//        int index = 0;
//        while (index < number.length){ // allows the user to enter numbers.
//            number[index] = Integer.parseInt(reader.nextLine());
//            System.out.println(number[index]);
//            index = index + 1; // moving to the next index
//            System.out.println(index);
//
//        }

//        System.out.println("here are the numbers again: ");
//        index = 0;
//        while (index < number.length){ // loop to print out the numbers that were inputted
//            System.out.println(number[index]);
//            index=index + 1;
//        }

        int[] numbers = {5,4,3,2,1};
        System.out.println(Arrays.toString(numbers));
        sumOfNumbersInArray(numbers);

    }
}
