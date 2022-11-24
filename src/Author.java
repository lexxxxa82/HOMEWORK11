public class Author {
    private final String firstName;
    private final String surname;

    public Author(String firstName,String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
}
