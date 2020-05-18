package doggie;

public class Dog {
    //instance variables
    int size;
    String breed;
    String name;

    //method
    public void bark() {
        if (size > 60) {
            System.out.println(" Ruff Ruff");
        } else if (size < 60) {
            System.out.println("Bow wow");
        }
    }

    public void setSize(int size) {
        this.size = size;
    }
}

