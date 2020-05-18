package books;

public class BooksTestDrive {
    public static void main(String[] args) {
        Books  [] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        int x = 0;
        myBooks[0].title = "the grapes of java";
        myBooks[1].title = "the java gatsby";
        myBooks[2].title = "The java cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Ian";

        while (x < myBooks.length){
            System.out.println(myBooks[x].title);
            System.out.println(myBooks[x].author);
            x=x+1;
        }

    }
}
