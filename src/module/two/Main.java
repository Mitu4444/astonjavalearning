package module.two;

import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws URISyntaxException {

        InputStream fileStream = Main.class.getClassLoader().getResourceAsStream("studentandbooks.txt");

        List<Student> students = new Parser(fileStream).parsing();

        students.stream()
                .peek(System.out::println)
                .flatMap(s -> s.getBooks().stream().toList().stream())
                .peek(System.out::println)
                .sorted(Comparator.comparingInt(Book::getCountPage))
                .peek(System.out::println)
                .distinct()
                .filter(b -> b.getYearRelease() > 2000)
                .limit(3)
                .map(Book::getYearRelease)
                .findFirst()
                .ifPresentOrElse(
                        y -> System.out.println(y),
                        () -> System.out.println("Такого значения нет")
                        );
        ;
    }
}
