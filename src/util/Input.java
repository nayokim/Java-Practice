package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("type anything");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter Yes or No (y/n)");
        if (scanner.nextLine().toLowerCase().equals("y")) {
            return true;
        }else{
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("enter a number");
        int isANumber = Integer.parseInt(scanner.nextLine());
        if(isANumber > max || isANumber < min ){
            System.out.println("Please try again");
            return getInt(min,max);
        }
        System.out.println("you are correct!");
        return isANumber;
    }

    public int getInt(){
        System.out.println("Enter a number");
        int isANumber = Integer.parseInt(scanner.nextLine());
        return isANumber;
    }

    public double getDouble(){
        System.out.println("Enter a number");
        double isADouble = Integer.parseInt(scanner.nextLine());
        return isADouble;
    }

    public double getDouble(double min, double max){
        System.out.println("DOUBLE DOUBLE WHAT? ENTER A DOUBLE!");
        double isADouble = Double.parseDouble(scanner.nextLine());
        if (isADouble < min || isADouble > max){
            System.out.println("HEY THATS NOT RIGHT, TRY AGAIN!");
            return getDouble(min,max);
        }else{
            return isADouble;
        }
    }


}
