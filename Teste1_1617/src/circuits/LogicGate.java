package circuits;

public abstract class LogicGate {

	public abstract LogicVariable[] getInputs();
	public abstract LogicVariable getOutput();
	public abstract String getSymbol();
	public abstract String getFormula();
	public abstract boolean getValue();
}
