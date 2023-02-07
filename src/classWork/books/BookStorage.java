package classWork.books;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size;

    public void add(Book book) {
        if (size == array.length) {
            extend();
        }
        array[size++] = book;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    private void extend() {
        Book[] tmp = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void searchByTitle(String keyWord) {
        boolean found = false;
        for (int i = 0; i < size; i++) {

            Book book = array[i];
            if (book.getTitle().toLowerCase().contains(keyWord.toLowerCase())) {
                found = true;
                System.out.println(book);
            }
        }
        if (!found) {
            System.out.println("By keyword \"" + keyWord + "\" nothing founds");
        }
    }

    public void searchByAuthor(String keyWordAuthor) {
        boolean found = false;
        for (int i = 0; i < size; i++) {

            Book book = array[i];
            if (book.getAuthor().toLowerCase().contains(keyWordAuthor.toLowerCase())) {
                found = true;
                System.out.println(book);
            }
        }
        if (!found) {
            System.out.println("By keyword \"" + keyWordAuthor + "\" nothing founds");
        }
    }

    public void searchByPrice(double min, double max) {
        boolean found = false;
        for (int i = 0; i < size; i++) {

            Book book = array[i];
            if (book.getPrice() >= min && book.getPrice() <= max) {
                found = true;
                System.out.println(book);
            }
        }
        if (!found) {
            System.out.println("There is not any book in range from " + min + " to " + max);
        }
    }
}
