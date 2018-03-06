package circuits;

public class GateNot extends LogicGate {

	private LogicVariable out,in;
	
	public GateNot(LogicVariable y1, LogicVariable w2) throws ColisionException, CycleException {
		// TODO Auto-generated constructor stub
		out = y1;
		in = w2;
		if(y1.getCalculatedBy() != null)
			throw new ColisionException();
		
		if(w2.getCalculatedBy() != null)
		{
			LogicVariable [] ins = w2.getCalculatedBy().getInputs();
			for(LogicVariable x : ins)
				if(x.getName().equals(y1.getName()))
					throw new CycleException();
		}
		
		y1.setcalculatedby(this);
	}

	@Override
	public LogicVariable getOutput() {
		// TODO Auto-generated method stub
		return out;
	}

	@Override
	public LogicVariable[] getInputs() {
		// TODO Auto-generated method stub
		LogicVariable[] result = {in};
		
		return result;
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return "NOT";
	}

	@Override
	public String getFormula() {
		// TODO Auto-generated method stub
		return "NOT(" + in.getFormula() + ")";
	}

	@Override
	public boolean getValue() {
		// TODO Auto-generated method stub
		if(in.getValue())
		{
			out.setValue(false);
			return false;
		}
		else
		{
			out.setValue(true);
			return true;
		}
	}

}
