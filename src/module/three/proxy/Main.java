package module.three.proxy;

public class Main {

    public static void main(String[] args) {

        Book book = new BookProxy("Идиот");

        book.read();
        book.read();
    }
}
