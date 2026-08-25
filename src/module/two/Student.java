package module.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Student {

    private final long studentId;

    private String firstName;
    private String lastName;

    List<Book> books;

    public Student(long studentId, String firstName, String lastName, List<Book> books) {

        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;

        this.books = Optional.ofNullable(books).orElse(new ArrayList<Book>());
    }

    public long getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = Optional.ofNullable(books).orElse(new ArrayList<Book>());
    }

    @Override
    public String toString() {
        return this.firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(books, student.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, firstName, lastName, books);
    }

}
