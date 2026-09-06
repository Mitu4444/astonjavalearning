package module.three.decorator;

public abstract class TextPlannerDecorator implements TextHandler{

    public TextHandler handler;

    public TextPlannerDecorator(TextHandler handler){
        this.handler = handler;
    }
}
