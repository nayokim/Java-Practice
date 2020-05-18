package ContactManager;

import java.util.Scanner;

public class ContactsTest {
    public static void main(String[] args) {
        boolean running = true;
        while(running){
            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "Enter an option (1, 2, 3, 4 or 5):");
            Scanner scanner = new Scanner(System.in);
            int userInput =Integer.parseInt(scanner.nextLine());
        }


//            if (userInput == 1){
//                System.out.println("View Contacts");
//            }
//            if (userInput == 2 ){
//                System.out.println("Adding a new Contact");
//            }
//            if (userInput == 3){
//                System.out.println("Search a contact by name");
//            }
//            if (userInput == 4 ){
//                System.out.println("Delete a Contact");
//            }
//            if (userInput == 5){
//                System.out.println("Are you sure you want to exit? ");
//            }




        }
}
