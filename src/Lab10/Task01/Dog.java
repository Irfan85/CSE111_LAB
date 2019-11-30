package Lab10.Task01;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void makeNoise(){
        System.out.println(getName() + " the dog says Wolf!");
    }
}
