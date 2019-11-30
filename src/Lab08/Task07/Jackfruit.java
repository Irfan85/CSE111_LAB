package Lab08.Task07;

public class Jackfruit extends Fruit{

    public Jackfruit(boolean formalin, String name) {
        super(formalin, name);
    }

    public Jackfruit() {
        super(false, "Jackfruit");
    }

    @Override
    public String toString() {
        return "Jackfruits are good for you";
    }
}
