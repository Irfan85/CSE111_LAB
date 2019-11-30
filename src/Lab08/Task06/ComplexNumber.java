package Lab08.Task06;

public class ComplexNumber extends RealNumber{
    public double imaginaryValue;

    public ComplexNumber(){
        super(1);
        imaginaryValue = 1;
    }

    public ComplexNumber(double real, double imaginary){
        super(real);
        this.imaginaryValue = imaginary;
    }



    @Override
    public String toString() {
        String output = "ImaginaryPart: " + this.imaginaryValue;
        return super.toString() + "\n" + output;
    }

    public void check() {
        System.out.println("I'm in ComplexNumber class");
        ping();
        System.out.println("Checking ended.");
    }
}
