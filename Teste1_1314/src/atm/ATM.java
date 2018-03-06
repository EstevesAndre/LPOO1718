package atm;

public class ATM {

	private int ID;
	private String district, code;
	public ATM(int ident, String district, String code) {
		// TODO Auto-generated constructor stub
		ID = ident;
		this.district = district;
		this.code = code;
	}
	
	public int getID()
	{
		return ID;
	}
	public String getDistrict()
	{
		return district;
	}
	public String getCode()
	{
		return code;
	}

}
