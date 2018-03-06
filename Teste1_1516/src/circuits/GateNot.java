package circuits;

public class GateNot extends LogicGate {

	private LogicVariable output, input;
	
	public GateNot(LogicVariable out, LogicVariable in) throws Exception {
		// TODO Auto-generated constructor stub
	
		if(in.getcalculated() != null)
		{
			LogicVariable[] inputs_of_in = in.getcalculated().getInputs();
			for(LogicVariable x : inputs_of_in)
				if(x.equals(out))
					throw new CycleException();
		}
		
		if(out.getcalculated()==null)
			out.setcalculated(this);
		else
			throw new ColisionException();
		
		output = out;
		input = in;
		if(in.getValue() == true)
			out.setValue(false);
		else
			out.setValue(true);
		
	}

	@Override
	public LogicVariable[] getInputs() {
		// TODO Auto-generated method stub
		LogicVariable[] inp = {input};
		return inp;
	}

	@Override
	public LogicVariable getOutput() {
		// TODO Auto-generated method stub
		return output;
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return "NOT";
	}

	@Override
	public String getFormula() {
		// TODO Auto-generated method stub
		return "NOT(" + input.getFormula() + ")";
	}

	@Override
	public boolean getValue() {
		// TODO Auto-generated method stub
		if(input.getValue() == true)
		{
			output.setValue(false);
			return false;
		}
		else
		{
			output.setValue(true);
			return true;
		}
	}

}
