package Lab11.Task07;

public class Cat extends Animal{
    public Cat(String sound){
        super(sound);
    }

    @Override
    public String makeSound() {
        return super.sound;
    }
}
