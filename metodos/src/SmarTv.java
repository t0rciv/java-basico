public class SmarTv {
    boolean on = false;
    int channel = 2;
    int volume = 18;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void turnUpVolume() {
        volume++;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }
}
