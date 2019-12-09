package Lab11.Task08;

public class Dog extends Animal implements SoundSource{
    Dog(String _name) {
        super(_name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " is crying.");
    }
}
