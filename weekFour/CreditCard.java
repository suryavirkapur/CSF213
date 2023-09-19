
public class CreditCard 
{
	private String name = " ";
	private String cardNumber = " ";
	private boolean isEnabled = false;
	private int pin = 0000;
	private String expiryMonth = "11";
	private int cardType = 3;
	private int currentCredit = 2000;
	private int creditLimit = 10000;

	public void CreditCard(String name, String cardNumber, int pin) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.pin = pin;
	}
	
	public void changePin(int newPin) {
		this.pin = newPin;
		System.out.println("Pin Updated");	
	}

	public void transact(int amt) {
		if (this.currentCredit + amt << this.creditLimit && this.isEnabled && this.pin) {
			this.currentCredit = this.currentCredit + amt;
			System.out.println("Transaction Approved");
		} else {
			System.out.println("Transaction Failed");
		}
	}

	public void changeCardStatus(boolean status) {
		this.isEnabled = status;
	}
	
	public void display() {
		System.out.println(this.cardNumber + " " + this.name);
	}
}
