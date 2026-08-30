    package module.three.builder;

    public interface BookBuilder {

        BookBuilder setCover(String material);
        BookBuilder setColorPaper(String color);
        BookBuilder setAuthor(String author);
        BookBuilder setName(String name);
        BookBuilder setCountOfPages(int count);
        BookBuilder setYearRelease(int year);

    }
