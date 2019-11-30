package Lab10.Task02;

public class Employee extends Person {
    private double annualSalary = 0.0;
    private int year = 0;
    private String NInsuranceNumnber = "";

    public Employee(String name, double annualSalary, int year, String natInsNum){
        super(name);
        this.annualSalary = annualSalary;
        this.year = year;
        this.NInsuranceNumnber = natInsNum;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYear() {
        return year;
    }

    public String getNInsuranceNumnber() {
        return NInsuranceNumnber;
    }

    public boolean equals(Employee employee) {
        return this.getNInsuranceNumnber().equals(employee.getNInsuranceNumnber());
    }
}
