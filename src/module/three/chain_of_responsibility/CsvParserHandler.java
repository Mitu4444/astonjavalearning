package module.three.chain_of_responsibility;

import java.util.Objects;

public class CsvParserHandler extends ParserHandler{

    @Override
    public boolean check(String fileType) {

        if(Objects.equals(fileType, "csv")){
            System.out.println("Parsing csv...");
            return true;
        }
        return checkNext(fileType);
    }
}
