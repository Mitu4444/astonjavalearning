package module.three.decorator;

public class TextCompressionDecorator extends TextPlannerDecorator{


    public TextCompressionDecorator(TextHandler handler) {
        super(handler);
    }

    @Override
    public String processing() {
        String text = handler.processing();

        String result = text.replace(" ", "");

        System.out.println(result);

        return result;
    }
}
