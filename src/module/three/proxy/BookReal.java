package module.three.proxy;

public class BookReal implements Book{

    public String name;

    public BookReal(String name){
        this.name = name;
        downloadBook();
    }

    public void downloadBook(){
        System.out.println("Downloading book \"" + name + "\" ...");
    }
    @Override
    public void read() {
        System.out.println("Opening book: " + name);
    }
}
