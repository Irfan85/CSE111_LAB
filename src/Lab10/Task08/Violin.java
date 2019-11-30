package Lab10.Task08;

public class Violin extends Instrument{

    @Override
    public void play() {
        System.out.println("In the playing method of violin");
    }

    @Override
    public void adjust() {
        System.out.println("In the adjust method of violin");
    }
}
