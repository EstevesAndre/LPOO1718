package circuits;

public class GateAnd extends LogicGate {

	private LogicVariable out,in1,in2;
	
	public GateAnd(LogicVariable w1, LogicVariable x1, LogicVariable x2) throws ColisionException, CycleException {
		// TODO Auto-generated constructor stub
		out = w1;
		in1 = x1;
		in2 = x2;
		
		if(w1.getCalculatedBy() != null)
			throw new ColisionException();
		
		if(x1.getCalculatedBy() != null)
		{
			LogicVariable [] ins = x1.getCalculatedBy().getInputs();
			for(LogicVariable x : ins)
				if(x.getName().equals(w1.getName()))
					throw new CycleException();
		}
		if(x2.getCalculatedBy() != null)
		{
			LogicVariable [] ins = x2.getCalculatedBy().getInputs();
			for(LogicVariable x : ins)
				if(x.getName().equals(w1.getName()))
					throw new CycleException();
		}
		w1.setcalculatedby(this);
	}

	@Override
	public LogicVariable getOutput() {
		// TODO Auto-generated method stub
		return out;
	}

	@Override
	public LogicVariable[] getInputs() {
		// TODO Auto-generated method stub
		LogicVariable[] ins = {in1,in2};
		
		return ins;
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return "AND";
	}

	@Override
	public String getFormula() {
		// TODO Auto-generated method stub
		return "AND(" + in1.getFormula() + "," + in2.getFormula() + ")";
	}

	@Override
	public boolean getValue() {
		// TODO Auto-generated method stub
		if(in1.getValue() && in2.getValue())
		{
			out.setValue(true);
			return true;
		}
		else
		{
			out.setValue(false);
			return false;
		}
	}

}
