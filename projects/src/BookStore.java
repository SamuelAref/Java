import java.util.*;

public class BookStore {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // Book Store
        // 1. Browse All Books
        // 2. Add new Book
        // 3. Remove Book
        // 4. Exit

        // BookStorage one = new BookStorage("Harry Potter", "J.k Rowling");
        // BookStorage two = new BookStorage("After", "Some girl");
        // BookStorage three = new BookStorage("Biology", "that guy");
        // BookStorage four = new BookStorage("Chemistry", "Rutherford");
        // BookStorage five = new BookStorage("Physics", "Newton");
        // BookStorage six = new BookStorage("Physics", "Einstein");
        // BookStorage seven = new BookStorage("Math", "Plank");
        // BookStorage eight = new BookStorage("Lijinet", "Zenebe wela");
        // BookStorage nine = new BookStorage("Shogun method", "Derek Rake");
        // BookStorage ten = new BookStorage("Comics", "Stan-lee");

        List<String> BookNames = new ArrayList<>();
        BookNames.add("Harry Potter");
        BookNames.add("After");
        List<String> BookAuthor = new ArrayList<>();
        BookAuthor.add("J.k Rowling");
        BookAuthor.add("Some girl");

        // choices
        System.out.println(" 1. Browse All Books 2. Add new Book 3. Remove Book 4. Exit");
        int userChoice = userInput.nextInt();

        while (userChoice != 4) {

            while (userChoice == 1) {

                System.out.println(BookNames + " " + BookAuthor);
                System.out.println("2.Add new Book 3. Remove Book 4.Exit");
                userChoice = userInput.nextInt();

            }
            while (userChoice == 2) {
                System.out.println("Enter Book Name: ");
                String addBook = userInput.next();
                System.out.println("Enter Book Author: ");
                String addAuthor = userInput.next();
                BookNames.add(addBook);
                BookAuthor.add(addAuthor);

                System.out.println("Book Added");
                System.out.println(BookNames + " " + BookAuthor);
                System.out.println(" 2.Add new Book 3. Remove Book 4.Exit");
                userChoice = userInput.nextInt();
            }

            while (userChoice == 3) {

                System.out.println("Enter Book Name: ");
                String removeBook = userInput.next();
                BookAuthor.remove(BookNames.indexOf(removeBook));
                BookNames.remove(removeBook);

                System.out.println("Book Deleted");
                System.out.println(BookNames + " " + BookAuthor);
                System.out.println("2.Add new Book 3. Remove Book 4.Exit");
                userChoice = userInput.nextInt();

            }

        }

        System.out.println("Exiting");

    }

}
