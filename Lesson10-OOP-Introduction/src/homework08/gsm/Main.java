package homework08.gsm;

public class Main {

    public static void main(String[] args) {
        GSM samsung = new GSM("Samsung S10");
        GSM xiaomi = new GSM("Xiaomi Mi10");

        samsung.insertSimCard("0812345678");
        xiaomi.insertSimCard("0887654321");

        samsung.call(xiaomi, 10);
        xiaomi.call(samsung, 40);

        samsung.printInfoForTheLastOutgoingCall();
        xiaomi.printInfoForTheLastIncomingCall();

        System.out.println("Sum for call: " + samsung.getSumForCall());

        samsung.removeSimCard();
        xiaomi.removeSimCard();
    }
}
