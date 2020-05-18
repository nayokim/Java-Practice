package ContactManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContactsList {
    import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

    public class Contacts {

        public String firstName;
        public String lastName;
        public String phoneNumber;

        //directory name
        public String directory = "directory";
        //filename
        public String filename = "contact.txt";

        //where the folder is going to live
        Path dataDirectory = Paths.get(directory);
        //where the file is going to live
        Path dataFile = Paths.get(directory, filename);

        public Contacts(String directory, String filename) {
            this.directory = directory;
            this.filename = filename;
        }

        public Contacts(String firstName, String lastName, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }


        //create menu
//    private static String returnMenuDisplay(){
//        String choices = ("1. View contacts.\n" +
//                "2. Add a new contact.\n" +
//                "3. Search a contact by name.\n" +
//                "4. Delete an existing contact.\n" +
//                "5. Exit.\n" +
//                "Enter an option (1, 2, 3, 4 or 5):");
//        return choices;
//    }
//
        //create the Directory
        public void createDirectory(Path aDir) {
            if (Files.notExists(aDir)) {
                try {
                    Files.createDirectory(aDir);
                } catch (IOException exp) {
                    System.out.println("Problems creating the directory - check dataDirectory");
                    exp.printStackTrace();
                }
            }
        }

        public void viewContacts() {


        }


    }

}
