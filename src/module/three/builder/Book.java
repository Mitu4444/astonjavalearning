package module.three.builder;

public class Book {

    private String cover;
    private String colorPaper;
    private String author;
    private String name;
    private int countOfPage;
    private int yearRelease;

    public Book(String cover, String colorPaper, String author, String name, int countOfPage, int yearRelease) {
        this.cover = cover;
        this.colorPaper = colorPaper;
        this.author = author;
        this.name = name;
        this.countOfPage = countOfPage;
        this.yearRelease = yearRelease;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getColorPaper() {
        return colorPaper;
    }

    public void setColorPaper(String colorPaper) {
        this.colorPaper = colorPaper;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public void setCountOfPage(int countOfPage) {
        this.countOfPage = countOfPage;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Book:\n");
        sb.append("Author: " + author + "\n")
                .append("Name: " + name + "\n")
                .append("Cover: " + cover + "\n")
                .append("Color paper: " + colorPaper + "\n")
                .append("Pages: " + countOfPage + "\n")
                .append("Year release: " + yearRelease + "\n");

        return sb.toString();
    }
}
