package circuits;

public class GateAnd extends LogicGate{

	private LogicVariable output, input1,input2;
	
	public GateAnd(LogicVariable out, LogicVariable in1, LogicVariable in2 ) throws Exception {
		// TODO Auto-generated constructor stub
	
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
		
		if(out.getcalculated() == null)
			out.setcalculated(this);
		else 
			throw new ColisionException();
		
		output = out;
		input1 = in1;
		input2 = in2;
		if(in1.getValue() == true && in2.getValue() == true)
			out.setValue(true);
		else
			out.setValue(false);
		
	}
	
	public LogicVariable getOutput()
	{
		return output;
	}
	public LogicVariable[] getInputs()
	{
		LogicVariable[] inp = {input1,input2};
		return inp;
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return "AND";
	}

	@Override
	public String getFormula() {
		// TODO Auto-generated method stub
		return "AND(" + input1.getFormula() + "," + input2.getFormula() + ")";
	}

	@Override
	public boolean getValue() {
		// TODO Auto-generated method stub
		if(input1.getValue() == true && input2.getValue() == true) {
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
