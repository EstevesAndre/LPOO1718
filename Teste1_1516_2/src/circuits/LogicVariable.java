package circuits;

public class LogicVariable {

	private String name;
	private boolean value;
	private LogicGate calculatedby;
	
	public LogicVariable(String string, boolean b) {
		// TODO Auto-generated constructor stub
		name= string;
		value = b;
		calculatedby = null;
	}

	public LogicVariable(String string) {
		// TODO Auto-generated constructor stub
		name = string;
		value = true;
		calculatedby = null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public boolean getValue() {
		// TODO Auto-generated method stub
		if(this.calculatedby == null)
			return value;
		else
		{
			return this.calculatedby.getValue(); 
		}
	}
	
	public LogicGate getCalculatedBy()
	{
		return calculatedby;
	}

	public void setValue(boolean b) {
		// TODO Auto-generated method stub
		value = b;
	}
	
	public void setcalculatedby(LogicGate x)
	{
		calculatedby = x;
	}

	public boolean equals(Object t2)
	{ return t2 != null && t2 instanceof LogicVariable &&
	this.name.equals(((LogicVariable)t2).name) ; }

	public String getFormula() {
		// TODO Auto-generated method stub
		if(this.getCalculatedBy() == null)
			return name;
		else{
			return this.getCalculatedBy().getFormula();
		}
	}

}
