package Lab04.Task09;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();

        acc1.setName("John Rawls");
        acc1.setAccountID("01");
        acc1.setAddress("Wakanda");
        acc1.setBalance(500000);
        acc1.addInterest();
        System.out.println("Name: " + acc1.getName() + "\n"
                + "Account ID: " + acc1.getAccountID() + "\n" + "Address: " + acc1.getAddress() + "\n" +
                "Balance: " + acc1.getBalance());
        System.out.println();

        acc2.setName("Mike Pence");
        acc2.setAccountID("02");
        acc2.setAddress("Pentagon");
        acc2.setBalance(400000);
        System.out.println("Name: " + acc2.getName() + "\n"
                + "Account ID: " + acc2.getAccountID() + "\n" + "Address: " + acc2.getAddress() + "\n" +
                "Balance: " + acc2.getBalance());
        System.out.println();

        acc3.setName("Carol Stefanson");
        acc3.setAccountID("03");
        acc3.setAddress("Edinburgh");
        acc3.setBalance(600000);
        acc3.addInterest();
        System.out.println("Name: " + acc3.getName() + "\n"
                + "Account ID: " + acc3.getAccountID() + "\n" + "Address: " + acc3.getAddress() + "\n" +
                "Balance: " + acc3.getBalance());
    }
}
