package Lab06.Task02;

public class Cat {
    public String color = "White";
    public String action = "sitting";
    //your code here

    public Cat(){

    }

    public Cat(String color){
        this.color = color;
    }

    public Cat(String color, String action){
        this.color = color;
        this.action = action;
    }

    public void printCat(){
        System.out.println(this.color + " cat is " + this.action);
    }

    public void changeColor(String color){
        this.color = color;
    }
}
