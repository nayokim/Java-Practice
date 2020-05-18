

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int N = scanner.nextInt();
        for (int i = 1; i <=10; i++){
            int product = i * N;
            System.out.printf("%d * %d = %d%n", N,i,product);
        }
    }
}
