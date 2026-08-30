package module.three.chain_of_responsibility;

import org.jetbrains.annotations.NotNull;

public abstract class ParserHandler {
    private ParserHandler next;

    public static ParserHandler link(ParserHandler first, ParserHandler @NotNull ... chain){
        ParserHandler head = first;

        for(ParserHandler nextInChain: chain){
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(String fileType);

    protected boolean checkNext(String fileType){
        if(next == null){
            System.out.println("Not Supported");
            return false;
        }
        return next.check(fileType);
    }

}
