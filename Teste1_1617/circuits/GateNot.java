package circuits;

public class GateNot extends LogicGate {

	public GateNot(LogicVariable out, LogicVariable in_1) throws Exception {
		super(out,in_1,null);
		out.setValue(!in_1.getValue());
	}

	public String getSymbol()
	{
		return "NOT";
	}

}
