package atm;

import java.util.*;

public class Withdrawal {

	private ATM atm;
	private Session sess;
	private Card card;
	private double number;
	private double amount;
	
	public Withdrawal(ATM a, Session s, Card c, double num) {
		// TODO Auto-generated constructor stub
		atm = a;
		sess = s;
		card = c;
		number = num;
		amount = 0.000;
	}

	public void setAmount(double num)
	{
		amount = num;
	}
	public double getAmount()
	{
		return amount;
	}
	
	public String toString()
	{
		return "Withdrawal at ATM " + atm.getID() + " (" + atm.getDistrict() + ", " +
				atm.getCode() + ") of " + String.format(Locale.US,"%.2f", amount);
	}
	
}
