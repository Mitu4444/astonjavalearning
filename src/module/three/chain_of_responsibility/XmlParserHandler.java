package module.three.chain_of_responsibility;

public class XmlParserHandler extends ParserHandler{

    @Override
    public boolean check(String fileType) {
        if(fileType == "xml"){
            System.out.println("Parsing xml...");
            return true;
        }
        return checkNext(fileType);
    }
}
