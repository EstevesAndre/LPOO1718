package atm;

public class Account {

	private String name;
	private double balance;
	
	public Account(String nome, double b) {
		// TODO Auto-generated constructor stub
		name = nome;
		balance = b;
	}

	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}

}
