import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author author;
    private int publishingYear;

    public Book( String nameBook, Author author, int publishingYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
       return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        int currentYear = LocalDate.now().getYear();
        if (publishingYear < 1880 || publishingYear > currentYear) {
            System.out.println("Invalid publishing year parameter: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }
    @Override
    public String toString() {
        return "название книги-" + this.nameBook + " автор-" + this.author + " год издания-" + this.publishingYear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameBook.equalsIgnoreCase(book.nameBook) && author.equals(book.author);

    }
    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author);
    }
}