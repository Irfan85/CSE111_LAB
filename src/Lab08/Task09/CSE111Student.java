package Lab08.Task09;

public class CSE111Student extends Student {
    String msg;
    public CSE111Student(){
        msg = "I love Java Programming";
    }

    @Override
    public String shout() {
        return msg;
    }
}
