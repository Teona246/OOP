package Library;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
    Map<Integer, Book> books = new HashMap<Integer, Book>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public Book getBookId(Integer id) {
        return books.get(id);
    }

    public Map<Boolean, List<Book>> partitionID(Integer n) {
        return books.values().stream()
                .collect(Collectors.partitioningBy(b -> b.getId() > n));
    }

    public List<Book> listOfBooks() {
        return books.values().stream()
                .sorted((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()))
                .toList();
    }

    public List<Book> listOfBooks(boolean isAvailable) {
        return books.values().stream()
                .filter(b -> b.isAvailable() == isAvailable)
                .toList();
    }

    public Map<Boolean, List<Book>> isAvailablePart() {
        return books.values().stream()
                .collect((Collectors.partitioningBy(b -> b.isAvailable())));
    }

    public Integer countBooks() {
        return books.size();
    }

    public Integer[] countAvailableBookd() {
        Integer available = Math.toIntExact(books.values().stream()
                .filter(b -> b.isAvailable()).
                count());
        Integer notAvailable = books.size() - available;
        return new Integer[]{available, notAvailable};
    }

    public Map<String, List<Book>> groupByAuthor() {
        return books.values().stream()
                .collect(Collectors.groupingBy(
                        b -> b.getAuthor(),
                        Collectors.toList()));
    }

    public List<String> authors() {
        return books.values().stream()
                .map(b -> b.getAuthor())
                .distinct()
                .sorted()
                .toList();
    }

    @Override
    public String toString() {
        return "Library{" + books + '}';
    }
}
