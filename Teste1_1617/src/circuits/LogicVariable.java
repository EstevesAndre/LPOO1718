package circuits;

public class LogicVariable implements Comparable<LogicVariable>{

	private String name;
	private boolean value;
	private LogicGate calculated;
	
	public LogicVariable(String name, boolean val) {
		// TODO Auto-generated constructor stub
		this.name = name;
		value = val;
		calculated = null;
	}

	public LogicVariable(String string) {
		// TODO Auto-generated constructor stub
		name = string;
		value = true;
	}

	public String getName()
	{
		return name;
	}
	public boolean getValue()
	{
		if(calculated == null)
			return value;
		else
			return calculated.getValue();
	}
	public void setcalculated(LogicGate lg)
	{
		calculated = lg;
	}
	public LogicGate getcalculated()
	{
		return calculated;
	}

	public void setValue(boolean val)
	{
		value = val;
	}

	public boolean equals(Object t2)
	{ return t2 != null && t2 instanceof LogicVariable &&
	this.name.equals(((LogicVariable)t2).name) &&
	this.value == (((LogicVariable)t2).getValue()); }

	public LogicGate getCalculatedBy() {
		// TODO Auto-generated method stub
		
		return calculated;
	}

	public String getFormula() {
		// TODO Auto-generated method stub
		if(calculated== null)
			return name;
		else 
			return calculated.getFormula();
	} 
	
	public int compareTo(LogicVariable v2)
	{
		return this.name.compareTo(v2.getName());
	}
}
