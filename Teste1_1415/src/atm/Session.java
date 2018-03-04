package atm;

public class Session implements Countable{

	public int counter;
	ATM atm;
	
	public Session(ATM a) {
		// TODO Auto-generated constructor stub
		atm = a;
		counter = 0;
	}

	public ATM getATM()
	{
		return atm;
	}
	
	public int count()
	{
		return counter;
	}
	
	public void addTransaction(Withdrawal w)
	{
		counter++;
	}
	public void addTransaction(Deposit d)
	{
		counter++;
	}
	
	 @Override
	 public boolean equals(Object obj) {
	 if (obj == null || ! (obj instanceof Session)) return false;
	 else return this.atm.getCode().equals(((Session)obj).getATM().getCode()) &&
			 this.atm.getDistrict().equals(((Session)obj).getATM().getDistrict()) &&
			 this.atm.getID() == (((Session)obj).getATM().getID());
	 } 
}
