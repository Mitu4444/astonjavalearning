package module.three.chain_of_responsibility;

import java.util.Objects;

public class JsonParserHandler extends ParserHandler{
    @Override
    public boolean check(String fileType) {
        if(Objects.equals(fileType, "json")){
            System.out.println("Json parsing...");
            return true;
        }
        return checkNext(fileType);
    }
}
