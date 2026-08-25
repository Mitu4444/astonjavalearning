package module.two;

import java.net.URISyntaxException;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws URISyntaxException {

        //String path = System.getProperty("user.dir");
        String path = Objects.requireNonNull(Main.class.getClassLoader().getResource("studentandbooks.txt")).getPath();

        System.out.println(path);

        List<Student> students = new Parser(path).parsing();

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
