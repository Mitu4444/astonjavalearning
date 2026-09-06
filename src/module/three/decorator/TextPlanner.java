package module.three.decorator;

public class TextPlanner implements TextHandler{

    private String text;

    public TextPlanner(String text){
        this.text = text;
    }

    @Override
    public String processing() {

        String result = text.toLowerCase();

        System.out.println(result);

        return result;
    }
}
