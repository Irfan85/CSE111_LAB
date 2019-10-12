package Lab04.Task14;

public class Complex {
    private double realPart;
    private double complexPart;

    public Complex(){
        realPart = 0.0;
        complexPart = 0.0;
    }

    public Complex(double realPart, double complexPart){
        this.realPart = realPart;
        this.complexPart = complexPart;
    }

    public Complex add(Complex complexNumber){
        Complex result = new Complex((this.realPart + complexNumber.getRealPart()), (this.complexPart + complexNumber.complexPart));
        return result;
    }

    public Complex subtract(Complex complexNumber){
        Complex result = new Complex((this.realPart - complexNumber.getRealPart()), (this.complexPart - complexNumber.complexPart));
        return result;
    }

    public Complex multiply(Complex complexNumber){
        double realProduct = this.realPart * complexNumber.getRealPart() - this.complexPart * complexNumber.complexPart;
        double complexProduct = this.complexPart * complexNumber.getRealPart() + this.realPart * complexNumber.complexPart;

        Complex result = new Complex(realProduct, complexProduct);

        return result;
    }

    public Complex divide(Complex complexNumber){
        Complex conjugate = new Complex(complexNumber.getRealPart(), -complexNumber.getComplexPart());

        Complex numerator = this.multiply(conjugate);
        double denominator = complexNumber.multiply(conjugate).getRealPart();

        Complex result = new Complex(numerator.getRealPart()/denominator, numerator.getComplexPart()/denominator);

        return result;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getComplexPart() {
        return complexPart;
    }

    public void setComplexPart(double complexPart) {
        this.complexPart = complexPart;
    }

    @Override
    public String toString() {
        return (this.realPart + " + " + this.complexPart + "i");
    }
}
