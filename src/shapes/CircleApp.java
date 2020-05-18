package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double userInput = input.getDouble();
        Circle circle = new Circle(userInput);
        System.out.println("Your circle's area is: " + circle.getArea(userInput));
        System.out.println("Your circle's circumference is: " + circle.getCircumference(userInput));
    }
}
