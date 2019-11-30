package Lab10.Task08;

public class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("In the playing method of Guitar");
    }

    @Override
    public void adjust() {
        System.out.println("In the adjust method of Guitar");
    }
}
