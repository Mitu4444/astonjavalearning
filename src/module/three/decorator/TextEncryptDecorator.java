package module.three.decorator;

import java.util.stream.Collectors;

public class TextEncryptDecorator extends TextPlannerDecorator{


    public TextEncryptDecorator(TextHandler handler) {
        super(handler);
    }

    @Override
    public String processing() {
        String text = handler.processing();

        String result = text.chars()
                            .map(c -> c + 13)
                            .mapToObj(c -> String.valueOf((char) c))
                            .collect(Collectors.joining());

        System.out.println(result);

        return result;
    }
}
