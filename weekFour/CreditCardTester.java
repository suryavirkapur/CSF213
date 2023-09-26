import java.util.Scanner;

class CreditCard {
    private String name;
    private String cardNo;
    private boolean enabled;
    private int pin;
    private String expiryMonth;
    private int cardType;
    private int currentCredit;
    private int creditLimit;

    public void setName(String name) { this.name = name; }
    public void setCardNo(String cardNo) { this.cardNo = cardNo; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public void setPin(int pin) { this.pin = pin; }
    public void setExpiryMonth(String expiryMonth) { this.expiryMonth = expiryMonth; }
    public void setCardType(int cardType) { this.cardType = cardType; }
    public void setCurrentCredit(int currentCredit) { this.currentCredit = currentCredit; }
    public void setCreditLimit(int creditLimit) { this.creditLimit = creditLimit; }

    public boolean transact(int amt) {
        if (enabled && amt <= (creditLimit - currentCredit)) {
            currentCredit += amt;
            float discount = 0;
            if (cardType == 3) discount = amt * 0.03f;
            else if (cardType == 2) discount = amt * 0.02f;
            else if (cardType == 1) discount = amt * 0.01f;
            currentCredit -= (int) discount;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Card No: " + cardNo);
        System.out.println("Enabled: " + enabled);
        System.out.println("PIN: " + pin);
        System.out.println("Expiry Month: " + expiryMonth);
        System.out.println("Card Type: " + cardType);
        System.out.println("Current Credit: " + currentCredit);
        System.out.println("Credit Limit: " + creditLimit);
    }
}

class PinChanger {
    public static void changePin(CreditCard card) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new PIN: ");
        int newPin = Integer.parseInt(scanner.nextLine());
        card.setPin(newPin);
        System.out.println("PIN changed successfully.");
    }
}

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        myCard.setName(scanner.nextLine());

        System.out.print("Enter card number: ");
        myCard.setCardNo(scanner.nextLine());

        System.out.print("Is card enabled? (true/false): ");
        myCard.setEnabled(Boolean.parseBoolean(scanner.nextLine()));

        System.out.print("Enter PIN: ");
        myCard.setPin(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter expiry month: ");
        myCard.setExpiryMonth(scanner.nextLine());

        System.out.print("Enter card type (Platinum=3, Gold=2, Silver=1): ");
        myCard.setCardType(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter current credit: ");
        myCard.setCurrentCredit(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter credit limit: ");
        myCard.setCreditLimit(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter transaction amount: ");
        int amt = Integer.parseInt(scanner.nextLine());

        if (myCard.transact(amt)) {
            System.out.println("Transaction successful");
        } else {
            System.out.println("Transaction failed");
        }

        myCard.display();

        System.out.println("Would you like to change the PIN? (yes/no): ");
        String changePinChoice = scanner.nextLine();

        if ("yes".equalsIgnoreCase(changePinChoice)) {
            PinChanger.changePin(myCard);
        }

        myCard.display();
    }
}
