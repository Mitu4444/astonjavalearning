package module.three.builder;

public class BookDirector {

    public void createClassicBook(BookBuilder builder){
        builder.setAuthor("Антуан де Сент-Экзюпери")
                .setName("Маленький принц")
                .setYearRelease(1943)
                .setCountOfPages(122);
    }
}
