package module.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){

        String path = System.getProperty("user.dir");
        System.out.println(path);


        List<Student> students = new Parser("src/module/two/studentandbooks.txt").parsing();

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
