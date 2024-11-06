package Bookshelf;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Mike", "Omer");

        Author author2 = new Author("Paulo", "Coelho");

        Book book1 = new Book("Inside the killer", author1, 2018);
        book1.setBookName("In the darkness");
        book1.setYearOfPublication(2019);

        Book book2 = new Book("Alchemist", author2, 1998);
        book2.setAuthor(new Author("Stephenie", "Meyer"));


        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
