package Library;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "1984", "Джордж Оруэлл", true);
        Book book2 = new Book(2, "Сто лет одиночества", "Габриэль Гарсиа Маркес", false);
        Book book3 = new Book(3, "Сто лет одиночества", "Габриэль Гарсиа Маркес", false);
        Book book4 = new Book(4, "Ведьмак", "Анджей Сапковски", true);
        Book book5 = new Book(5, "Единственный", "Джон Марс", false);
        Book book6 = new Book(6, "Отбор", "Кира Касс", true);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        System.out.println(library.getBookId(3));
        System.out.println(library.listOfBooks());
        System.out.println(library.listOfBooks(true));
        System.out.println(library.listOfBooks(false));
        System.out.println(library.countBooks());
        System.out.println(Arrays.toString(library.countAvailableBookd()));
        System.out.println(library.authors());
    }
}
