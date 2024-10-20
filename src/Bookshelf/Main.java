package Bookshelf;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author();
        author1.setFirstName("Mike");
        author1.setLastName("Omer");

        Author author2 = new Author();
        author2.setFirstName("Paulo");
        author2.setLastName("Coelho");

        Book book1 = new Book();
        book1.setBookName("Inside the killer");
        book1.setYearOfPublication(2018);
        book1.setAuthor(author1);

        Book book2 = new Book();
        book2.setBookName("Alchemist");
        book2.setYearOfPublication(1998);
        book2.setAuthor(author2);


        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
