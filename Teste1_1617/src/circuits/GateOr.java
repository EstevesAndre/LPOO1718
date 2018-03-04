package circuits;

public class GateOr extends LogicGate {

	private LogicVariable output, input1, input2;
	
	public GateOr(LogicVariable out, LogicVariable in1, LogicVariable in2) throws Exception {
		// TODO Auto-generated constructor stub
		if(out.getcalculated()==null)
			out.setcalculated(this);
		else
			throw new ColisionException();
		
		if(in1.getcalculated() != null)
		{
			LogicVariable[] inputs_of_in1 = in1.getcalculated().getInputs();
			for(LogicVariable x : inputs_of_in1)
				if(x.equals(out))
					throw new CycleException();
		}
		if(in2.getcalculated() != null)
		{
			LogicVariable[] inputs_of_in2 = in2.getcalculated().getInputs();
			for(LogicVariable x : inputs_of_in2)
				if(x.equals(out))
					throw new CycleException();
		}
		
		output = out;
		input1 = in1;
		input2 = in2;
		if(in1.getValue() == true || in2.getValue() == true)
			out.setValue(true);
		else
			out.setValue(false);
	}

	@Override
	public LogicVariable[] getInputs() {
		// TODO Auto-generated method stub
		LogicVariable[] inp = {input1,input2};
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
		return "OR";
	}

	@Override
	public String getFormula() {
		// TODO Auto-generated method stub
		return "OR(" + input1.getFormula() + "," + input2.getFormula() + ")";
	}

	@Override
	public boolean getValue() {
		// TODO Auto-generated method stub
		if(input1.getValue() == true || input2.getValue() == true) {
			output.setValue(true);
			return true;
		}
		else
		{
			output.setValue(false);
			return false;
		}
	}

}
