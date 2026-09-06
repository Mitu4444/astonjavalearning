package module.three.chain_of_responsibility;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("fileType: ");
        String fileType = scanner.nextLine();

        ParserHandler parserHandler = ParserHandler.link(
                new CsvParserHandler(),
                new JsonParserHandler(),
                new XmlParserHandler()
        );


        parserHandler.check(fileType);

    }

}
