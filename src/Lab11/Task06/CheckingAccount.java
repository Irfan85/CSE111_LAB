package Lab11.Task06;

public class CheckingAccount extends Account{
    public CheckingAccount(String name, double balance) {
        super(name);
        super.setBalance(balance);
    }

    @Override
    public void printAccountInfo() {
        String output = "=======================================\n" +
                        "Name : " + super.getName() + "\n" +
                        "Account Number : " + super.getAccountNumber() + "\n"+
                        "Balance : " + super.getBalance() + "\n";
        if(super.getBalance() <= 400) {
            output = output.concat("Your balance is less than the minimum amount\n");
        }
        output = output.concat("=======================================");

        System.out.println(output);
    }

    public String deposit(double amount){
        String output = "";
        if (amount > 0){
            super.setBalance(super.getBalance() + amount);
            output = output.concat("Deposit Successful");
        }else{
            output = output.concat("Please enter amount greater than Zero");
        }
        return output;
    }

    public String withdraw(double amount){
        String output = "";
        if (amount > 0){
            if (super.getBalance() >= amount){
                super.setBalance(super.getBalance() - amount);
                output = output.concat("Withdraw Successful");
            }else{
                output = output.concat("You do not have enough funds");
            }
        }else{
            output = output.concat("Please enter amount greater than Zero");
        }

        return output;
    }
}
