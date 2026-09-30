class ATMCard {
    private final String cardNo;
    private int pin;

    ATMCard(String cardNo, int pin) {
        this.cardNo = cardNo;
        this.pin = pin;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setPin(int newPin) {
        if (newPin >= 1000 && newPin <= 9999)
            pin = newPin;
    }

    public boolean verifyPin(int p) {
        return pin == p;
    }
}

public class Card {
    public static void main(String[] args) {
        ATMCard c = new ATMCard("XX-4417", 1234);
        c.setPin(4321);
        System.out.println(c.getCardNo());
        c.setPin(4321);
        System.out.println(c.verifyPin(4321));
    }
}