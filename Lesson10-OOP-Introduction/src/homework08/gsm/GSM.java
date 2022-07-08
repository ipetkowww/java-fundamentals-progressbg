package homework08.gsm;

public class GSM {

    String model;
    boolean hasSimCard;
    String simMobileNumber;
    int outgoingCallsDuration;
    Call lastIncomingCall;
    Call lastOutgoingCall;

    public GSM(String model) {
        this.model = model;
    }

    void insertSimCard(String simMobileNumber) {
        boolean validNumber = isValidNumber(simMobileNumber);
        if (validNumber) {
            this.simMobileNumber = simMobileNumber;
            this.hasSimCard = true;
            System.out.println("Sim card successfully inserted");
            return;
        }
        System.out.println("Sim card cannot be inserted due to invalid number.");
    }

    void removeSimCard() {
        this.hasSimCard = false;
        this.simMobileNumber = null;
        System.out.println("Sim card successfully removed.");
    }

    void call(GSM receiver, int duration) {
        if (this.hasSimCard && receiver.hasSimCard && !this.simMobileNumber.equals(receiver.simMobileNumber)) {
            if (duration > 0) {
                System.out.println("Calling to " + receiver.model + " phone with number: " + receiver.simMobileNumber);
                Call call = new Call(duration);
                call.caller = this;
                call.receiver = receiver;
                for (int i = 0; i < duration; i++) {
                    System.out.println("Now you are speaking...");
                }
                this.lastOutgoingCall = call;
                receiver.lastIncomingCall = call;
                this.outgoingCallsDuration += duration;
                System.out.println("Call finished.");
            }
        } else {
            System.out.println("Call cannot be processed");
        }
    }

    double getSumForCall() {
        return this.outgoingCallsDuration * Call.priceForAMinute;
    }

    void printInfoForTheLastOutgoingCall() {
        if (lastOutgoingCall != null) {
            System.out.println("Last outgoing call for " + this.model + " phone was to: ");
            System.out.println("Phone: " + this.lastOutgoingCall.receiver.model);
            System.out.println("With Number: " + this.lastOutgoingCall.receiver.simMobileNumber);
            System.out.println("Duration of " + this.lastOutgoingCall.duration + " minutes.");
        } else {
            System.out.println("No outgoing calls for " + this.model + " phone");
        }

    }

    void printInfoForTheLastIncomingCall() {
        if (lastIncomingCall != null) {
            System.out.println("Last incoming call for " + this.model + " phone was to: ");
            System.out.println("Phone: " + lastIncomingCall.caller.model);
            System.out.println("With Number: " + lastIncomingCall.caller.simMobileNumber);
            System.out.println("Duration of " + lastIncomingCall.duration + " minutes.");
        } else {
            System.out.println("No incoming calls for " + this.model + " phone");
        }

    }

    boolean isValidNumber(String simMobileNumber) {
        boolean containsDigitOnly = true;
        for (int i = 0; i < simMobileNumber.length(); i++) {
            char currentChar = simMobileNumber.charAt(i);
            boolean isDigit = Character.isDigit(currentChar);
            if (!isDigit) {
                containsDigitOnly = false;
                break;
            }
        }
        return simMobileNumber.startsWith("08") && simMobileNumber.length() == 10 && containsDigitOnly;
    }

}
