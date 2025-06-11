package PracticeSheets.Module6Arrays.Arrays;

import java.util.Scanner;

//Q:Create a Book class with title and price. Count how many books are priced above 500.
class Book {
    String title;
    double price;
}

public class Q16BookPriceChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];

        System.out.println("Enter details of 3 books:");

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            System.out.print("Enter title of book " + (i + 1) + ": ");
            books[i].title = scanner.nextLine();
            System.out.print("Enter price of book " + (i + 1) + ": ");
            books[i].price = scanner.nextDouble();
            scanner.nextLine(); // consume leftover newline
        }

        int count = 0;
        for (Book b : books) {
            if (b.price > 500) {
                count++;
            }
        }

        System.out.println("Books priced above 500: " + count);
    }
}
