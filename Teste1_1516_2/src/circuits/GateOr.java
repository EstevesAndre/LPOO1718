package circuits;

public class GateOr extends LogicGate {

	private LogicVariable out,in1,in2;
	
	public GateOr(LogicVariable w2, LogicVariable w1, LogicVariable x3) throws ColisionException, CycleException {
		// TODO Auto-generated constructor stub
		out = w2;
		in1 = w1;
		in2 = x3;
		if(w2.getCalculatedBy() != null)
			throw new ColisionException();
		
		if(w1.getCalculatedBy() != null)
		{
			LogicVariable [] ins = w1.getCalculatedBy().getInputs();
			for(LogicVariable x : ins)
				if(x.getName().equals(w2.getName()))
					throw new CycleException();
		}
		if(x3.getCalculatedBy() != null)
		{
			LogicVariable [] ins = x3.getCalculatedBy().getInputs();
			for(LogicVariable x : ins)
				if(x.getName().equals(w2.getName()))
					throw new CycleException();
		}
		
		w2.setcalculatedby(this);
			
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
		return "OR";
	}

	@Override
	public String getFormula() {
		// TODO Auto-generated method stub
		return "OR(" + in1.getFormula() + "," + in2.getFormula() + ")";
	}

	@Override
	public boolean getValue() {
		// TODO Auto-generated method stub
		if(in1.getValue() || in2.getValue())
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
