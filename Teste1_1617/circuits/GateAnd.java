package circuits;

public class GateAnd extends LogicGate{

	
	public GateAnd(LogicVariable l1, LogicVariable l2, LogicVariable l3) throws Exception {
		super(l1,l2,l3);		
	}
	
	
	public String getSymbol()
	{
		return "AND";
	}
	
}
