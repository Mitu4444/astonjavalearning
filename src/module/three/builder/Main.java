package module.three.builder;

public class Main {

    public static void main(String[] args) {

        BookDirector director = new BookDirector();

        ClassicBookBuilder builder = new ClassicBookBuilder();
        director.createClassicBook(builder);

        Book book = builder.getResult();

        System.out.println(book);
    }
}
