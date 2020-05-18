import java.util.Scanner;

public class methodsExercise {

    public static int addition(int input1, int input2){
        return input1 + input2;
    }

    public static int subtraction (int input1, int input2){
        return (input1 - input2);
    }

    public static int multiplication (int input1, int input2){
        return (input1 * input2);
    }

    public static int division(int input1, int input2){
        if (input1 == 0) {
            System.out.println("you cannot divide by 0");
        }
        return (input2 / input1);
    }

    public static int modulus (int input1 , int input2){
        return (input2 % input1);
    }

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        //Basic Arithmetic
        //Create four separate methods. Each will perform an arithmetic operation:
        //Each function needs to take two parameters/arguments so that the operation can be performed.
        //Food for thought: What happens if we try to divide by zero? What should happen?
        //modulus
        System.out.println(modulus(16, 4));
        System.out.println(0 == modulus(16,4));
        System.out.println(0 == modulus(2,2));
        //Addition
        System.out.println(addition(2,2));
        System.out.println(20 == addition(10,10));
        //Subtraction
        System.out.println(5 == subtraction(10,5));
        //Multiplication
        System.out.println(20 == multiplication(2,10));
        //Division
        System.out.println(division(2,10));
        System.out.println(division(0,10));
        //Create your multiplication method without the * operator (Hint: a loop might be helpful).
        //Do the above with recursion.





    }
}
