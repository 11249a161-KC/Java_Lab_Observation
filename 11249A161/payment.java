interface Pay {
    void pay(double amount);
}

class UPIPayment implements Pay {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Processing UPI payment of Rs" + amount + " to ID: " + upiId);
    }
}

class CardPayment implements Pay {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        String maskedCard = "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Processing Card payment of Rs" + amount + " using Card: " + maskedCard);
    }
}

public class payment {
    public static void main(String[] args) {
        Pay upi = new UPIPayment("user@okbank");
        Pay card = new CardPayment("1234567890123456");

        upi.pay(500.0);
        card.pay(3200.00);
    }
}
