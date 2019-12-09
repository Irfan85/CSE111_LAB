package Lab11.Task04;

public class FootBallTeam extends Team {
    FootBallTeam(String name, String mascot) {
        super(name, mascot);
    }

    @Override
    public void getMascot() {
        System.out.print("Our football team mascot name is ");
        super.getMascot();
    }

    @Override
    public String toString() {
        return "Our Name is " + super.name + "\n"
                + "We play Football";
    }
}
