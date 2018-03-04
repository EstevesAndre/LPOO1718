package atm;

public class Deposit {

	private ATM atm;
	private Session sess;
	private Card card;
	private double number;
	
	public Deposit(ATM a, Session s, Card c, double num) {
		// TODO Auto-generated constructor stub
		atm = a;
		sess = s;
		card = c;
		number = num;
	}

}
