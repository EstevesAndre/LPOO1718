package circuits;

public class GateOr extends LogicGate {

	
	public GateOr(LogicVariable out, LogicVariable in_1, LogicVariable in_2) throws Exception
	{
		super(out,in_1,in_2);
	}

	public String getSymbol()
	{
		return "OR";
	}
}
