package Bookshelf;

public class Book {
    private String bookName;
    private Author author;
    private Integer yearOfPublication;

    public Book() {
    }

    public Book(String bookName, Author author, Integer yearOfPublication) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return
                "Book: '" + bookName + "', " + author +
                        ", year of publication: " + yearOfPublication;
    }
}
