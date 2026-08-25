package module.two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Parser {

    private final String filePath;

    public Parser(final String filePath) {
        this.filePath = filePath;
    }

    public List<Student> parsing() {

        String line;
        HashSet<Student> students = new HashSet<Student>();

        final int STUDENT_ID = 0;
        final int FIRST_NAME = 1;
        final int LAST_NAME = 2;

        final int BOOK_NAME = 0;
        final int BOOK_AUTHOR = 1;
        final int YEAR_RELEASE = 2;
        final int COUNT_PAGE = 3;

        final int DATA_STUDENT_LENGTH = 3;
        final int DATA_BOOK_LENGTH = 4;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            Student current = null;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == DATA_STUDENT_LENGTH) {
                    long studentId = Long.parseLong(data[STUDENT_ID]);
                    String firstName = data[FIRST_NAME];
                    String lastName = data[LAST_NAME];

                    current = new Student(studentId, firstName, lastName, new ArrayList<Book>());
                    students.add(current);

                } else if (data.length == DATA_BOOK_LENGTH) {

                    String name = data[BOOK_NAME];
                    String author = data[BOOK_AUTHOR];
                    int yearRelease = Integer.parseInt(data[YEAR_RELEASE]);
                    int countPage = Integer.parseInt(data[COUNT_PAGE]);

                    if (current == null) continue;

                    current.getBooks().add(new Book(name, author, yearRelease, countPage));
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        return students.stream().toList();
    }
}
