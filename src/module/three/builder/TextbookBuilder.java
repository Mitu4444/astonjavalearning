package module.three.builder;

public class TextbookBuilder implements BookBuilder {


    private String author;
    private String name;
    private String material = "Soft";
    private String color = "Yellow";
    private int countOfPage;
    private int yearRelease;

    @Override
    public BookBuilder setCover(String material) {
        this.material = material;
        return this;
    }

    @Override
    public BookBuilder setColorPaper(String color) {
        this.color = color;
        return this;
    }

    @Override
    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public BookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BookBuilder setCountOfPages(int count) {
        this.countOfPage = count;
        return this;
    }

    @Override
    public BookBuilder setYearRelease(int year) {
        this.yearRelease = year;
        return this;
    }

    public Book getResult(){
        return new Book(material, color, author, name, countOfPage, yearRelease);
    }
}
