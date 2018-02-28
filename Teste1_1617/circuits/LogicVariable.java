package circuits;

public class LogicVariable {

	private String name;
	private boolean value;
	private LogicGate whocalculates;
	
	public LogicVariable(String nome, boolean valor)
	{
		name = nome;
		value = valor;
		whocalculates = null;
	}
	
	public LogicVariable(String nome) {
		name = nome;
		value = true;
		whocalculates = null;
	}

	public String getName()
	{
		return name;
	}
	public boolean getValue()
	{
		return value;
	}
	
	public void setValue(boolean valor)
	{
		value = valor;
	}
	public void setGate(LogicGate g)throws Exception
	{
		if(whocalculates != null) {
			///throw new ColisionException();
		}
		else {
			whocalculates = g;
		}
	}
	
	public boolean equals (LogicVariable t2)
	{
		return (t2 != null) && (t2 instanceof LogicVariable) && 
				(this.name.equals( ((LogicVariable)t2).getName()));
	}
	
	public LogicGate getCalculatedBy()
	{
		return whocalculates;
	}

	public LogicGate getFormula() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
