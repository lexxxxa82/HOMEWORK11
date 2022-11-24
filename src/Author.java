import java.util.Objects;

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

    @Override
    public String toString() {
        return this.firstName + " "+this.surname;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equalsIgnoreCase(author.firstName) && surname.equalsIgnoreCase(author.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname);
    }
}
