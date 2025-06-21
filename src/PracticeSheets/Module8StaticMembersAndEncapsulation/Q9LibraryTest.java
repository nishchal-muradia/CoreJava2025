package PracticeSheets.Module8StaticMembersAndEncapsulation;


/*Create a class LibraryBook:
        private fields: title, author
        static field: libraryName
        constructor to initialize title/author
        static method to change library name
        method to display book details
        Create multiple books, change the library name and display the result.*/


class LibraryBook {
    // Private instance variables
    private String title;
    private String author;

    // Static variable shared by all objects
    private static String libraryName;

    // Constructor to initialize book details
    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Static method to change library name
    public static void changeLibraryName(String newName) {
        libraryName = newName;
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Library Name : " + libraryName);
        System.out.println("------------------------------");
    }
}

public class Q9LibraryTest {
    public static void main(String[] args) {
        // Set initial library name
        LibraryBook.changeLibraryName("City Central Library");

        // Create book objects
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho");
        LibraryBook book2 = new LibraryBook("To Kill a Mockingbird", "Harper Lee");

        // Display book details before changing library name
        System.out.println(" Initial Library Info:");
        book1.displayBookInfo();
        book2.displayBookInfo();

        // Change library name
        LibraryBook.changeLibraryName("Grand National Library");

        // Display book details again after name change
        System.out.println("\n After Changing Library Name:");
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
