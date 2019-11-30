package Lab10.Task08;

public class Keyboard extends Instrument {
    @Override
    public void play() {
        System.out.println("In the playing method of Keyboard");
    }

    @Override
    public void adjust() {
        System.out.println("In the adjust method of Keyboard");
    }
}
