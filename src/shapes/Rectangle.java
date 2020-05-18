package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return (this.width * this.length);
    }

    public double getPerimeter(){
        return ((this.width * 2) + (this.length * 2));
    }

}

