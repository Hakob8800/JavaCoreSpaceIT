package classWork.books;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();

        boolean isRun = true;
        while (isRun) {
            System.out.println("--------------------");
            System.out.println("For exit press 1");
            System.out.println("For add book press 2");
            System.out.println("For print all books press 3");
            System.out.println("For search by title press 4");
            System.out.println("For search by author press 5");
            System.out.println("For search by price press 6");
            System.out.println("--------------------");
            String command = scan.nextLine();
            switch (command) {
                case "1":
                    isRun = false;
                    break;
                case "2":
                    System.out.println("Please enter book's title");
                    String title = scan.nextLine();
                    System.out.println("Please enter book's author");
                    String author = scan.nextLine();
                    System.out.println("please enter book's price");
                    String price = scan.nextLine();
                    Book book = new Book(title, author, Double.parseDouble(price));
                    bookStorage.add(book);
                    System.out.println("Book successfully added");
                    break;
                case "3":
                    bookStorage.print();
                    break;
                case "4":
                    System.out.println("Please enter keyword");
                    String keyWordTitle = scan.nextLine();
                    bookStorage.searchByTitle(keyWordTitle);
                    break;
                case "5":
                    System.out.println("Please enter keyword");
                    String keyWordAuthor = scan.nextLine();
                    bookStorage.searchByAuthor(keyWordAuthor);
                    break;
                case "6":
                    System.out.println("Please enter MIN price for search");
                    double min = Double.parseDouble(scan.nextLine());
                    System.out.println("Please enter MAX price for search");
                    double max = Double.parseDouble(scan.nextLine());
                    bookStorage.searchByPrice(min, max);
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");
            }

        }
    }

}
