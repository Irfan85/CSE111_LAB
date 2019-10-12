package Lab04.Task13;

public class ClockDemo {
    public static void main(String[] args) {
        Clock firstClock = new Clock(18375);

        firstClock.tick();

        Clock secondClock = new Clock(5, 6, 15);

        for(int i = 0; i < 10; i++){
            secondClock.tick();
        }

        firstClock = firstClock.addClock(secondClock);

        System.out.println(firstClock);
        System.out.println(secondClock);

        Clock thirdClock = firstClock.subtractClock(secondClock);

        System.out.println(thirdClock);
    }
}
