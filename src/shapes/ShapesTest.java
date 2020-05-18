package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1= new Rectangle(5,4);

        System.out.println(18 == box1.getPerimeter());
        System.out.println("Perimeter of box1 = " + box1.getPerimeter());

        System.out.println(20 == box1.getArea());
        System.out.println("Area of box1 = " + box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println(25 == box2.getArea());
        System.out.println("area of box 2 = " + box2.getArea());

        System.out.println(20 == box2.getPerimeter());
        System.out.println("perimeter of box 2 = " + box2.getPerimeter());

    }
}
