package module.two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            Student current = null;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 3) {
                    long studentId = Long.parseLong(data[0]);
                    String firstName = data[1];
                    String lastName = data[2];

                    current = new Student(studentId, firstName, lastName, new ArrayList<Book>());
                    students.add(current);

                } else if (data.length == 4) {

                    String name = data[0];
                    String author = data[1];
                    int yearRelease = Integer.parseInt(data[2]);
                    int countPage = Integer.parseInt(data[3]);

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
