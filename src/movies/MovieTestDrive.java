package movies;

public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "Gone with the stock";
        one.genre = "Tragic";
        one.rating = -2;
        System.out.println(one.title + one.genre+ one.rating);

        Movie two = new Movie();
        two.title = "Lost in Cubicle space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "tragic but uplifting";
        three.rating = 127;
    }
}
