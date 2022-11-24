import java.time.LocalDate;

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
  }