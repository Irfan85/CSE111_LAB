package Lab11.Task07;

public class Dog extends Animal{
    public Dog(String sound){
        super(sound);
    }

    @Override
    public String makeSound() {
        return super.sound;
    }
}

