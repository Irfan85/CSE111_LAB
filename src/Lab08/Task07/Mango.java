package Lab08.Task07;

public class Mango extends Fruit{

    public Mango(boolean formalin, String name) {
        super(formalin, name);
    }

    public Mango() {
        super(true, "Mango");
    }

    @Override
    public String toString() {
        return "Mangos are bad for you";
    }
}
