package homework08.gsm;

public class Call {

    static double priceForAMinute = 1.2;
    GSM caller;
    GSM receiver;
    int duration;

    public Call(int duration) {
        this.duration = duration;
    }

}
