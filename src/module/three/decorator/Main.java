package module.three.decorator;

public class Main {

    public static void main(String[] args) {

        String text = "Hello World!";

        TextHandler handler = new TextPlanner(text);

        handler = new TextCompressionDecorator(handler);
        handler = new TextEncryptDecorator(handler);

        System.out.println(handler.processing());
    }

}
