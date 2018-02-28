package circuits;

public abstract class LogicGate {

	protected LogicVariable out,in1,in2;
	
	public LogicGate(LogicVariable out, LogicVariable in_1, LogicVariable in_2) throws Exception {
		this.out = out;
		in1 = in_1;
		in2 = in_2;
		out.setGate(this);		
	}

	public LogicVariable getOutput()
	{
		return out;
	}

	public LogicVariable[] getInputs()
	{
		LogicVariable[] res = {in1,in2};
		return res;
	}

	public abstract String getSymbol() ;
}
