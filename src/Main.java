public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");

        Author author1 = new Author("Alexander", "Green");
        // Author author2 = new Author("ALEXANDER", "GREEN");
        Author author2 = new Author("Alexander+1", "Green");

        Book book = new Book("War and Peace",author, 1880);

        Book book1 = new Book("Scarlet Sails", author1, 1922);
        // Book book2 = new Book("SCARLET SAILS", author2, 1922);
        Book book2 = new Book("Scarlet Sails+1", author2, 1922);

        System.out.println(book);
        System.out.println(book1);

        book.setPublishingYear(2022);
        book1.setPublishingYear(2022);

        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2));
        System.out.println(author1.equals(author2));

    }
}