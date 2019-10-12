package Lab04.Task13;

public class Clock {
    private int hours, minutes, seconds;

    public Clock(){
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock(int seconds){
        //convert
        setClock(seconds);
    }

    public void setClock(int seconds){
        //convert
        this.hours = seconds / 3600;

        int remainder = seconds % 3600;
        this.minutes = remainder / 60;

        remainder = remainder % 60;
        this.seconds = remainder;

    }

    public void tick(){
        //convert and add
        int grandSeconds = (this.hours * 3600) + (this.minutes * 60) + this.seconds;
        grandSeconds++;
        setClock(grandSeconds);

    }

    public void tickDown(){
        //convert and subtract
        int grandSeconds = (this.hours * 3600) + (this.minutes * 60) + this.seconds;
        grandSeconds--;
        setClock(grandSeconds);
    }

    public Clock addClock(Clock clock){
        //add
        int grandSeconds1 = (this.hours * 3600) + (this.minutes * 60) + this.seconds;
        int grandSeconds2 = (clock.getHours() * 3600) + (clock.getMinutes() * 60) + clock.getSeconds();
        Clock tikTok = new Clock();
        tikTok.setClock(grandSeconds1 + grandSeconds2);
        return tikTok;
    }

    public Clock subtractClock(Clock clock){
        //subtract
        int grandSeconds1 = (this.hours * 3600) + (this.minutes * 60) + this.seconds;
        int grandSeconds2 = (clock.getHours() * 3600) + (clock.getMinutes() * 60) + clock.getSeconds();
        Clock tikTok = new Clock();
        tikTok.setClock(Math.abs(grandSeconds1 - grandSeconds2));
        return tikTok;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
