public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Author author1 = new Author("Alexander", "Green");
        Book book = new Book("War and Peace",author, 1880);
        Book book1 = new Book("Scarlet Sails", author1, 1922);

        System.out.println(book.getNameBook() + " - " + author.getFirstName() + " " + author.getSurname() + " " + book.getPublishingYear()+ " год");
        System.out.println(book1.getNameBook() + " - " + author1.getFirstName() + " " + author1.getSurname() + " " + book1.getPublishingYear()+ " год");

        book.setPublishingYear(2022);
        book1.setPublishingYear(2022);

        System.out.println(book.getNameBook() + " - " + author.getFirstName() + " " + author.getSurname() + " " + book.getPublishingYear()+ " год");
        System.out.println(book1.getNameBook() + " - " + author1.getFirstName() + " " + author1.getSurname() + " " + book1.getPublishingYear()+ " год");

        }
}