package Lab11.Task04;

public class CricketTeam extends Team{

    CricketTeam(String name, String mascot) {
        super(name, mascot);
    }

    @Override
    public void getMascot() {
        System.out.print("Our cricket team mascot name is ");
        super.getMascot();
    }

    @Override
    public String toString() {
        return "Our Name is " + super.name + "\n"
                + "We play Cricket";
    }
}
