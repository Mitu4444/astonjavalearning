package module.three.proxy;

public class BookProxy implements Book{

    private String name;
    private BookReal bookReal;

    public BookProxy(String name){
        this.name = name;
    }

    @Override
    public void read() {
        if(bookReal == null){
            bookReal = new BookReal(name);
        }

        bookReal.read();
    }
}
