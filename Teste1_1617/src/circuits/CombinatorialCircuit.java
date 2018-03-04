package circuits;

import java.util.*;

public class CombinatorialCircuit {

	private TreeSet<LogicVariable> logics;
	
	public CombinatorialCircuit() {
		// TODO Auto-generated constructor stub
		logics = new TreeSet<LogicVariable>();
	}
	
	public boolean addVariable(LogicVariable lg)
	{
		if(logics.contains(lg))
			return false;
		logics.add(lg);
		return true;
	}

	
	public LogicVariable getVariableByName(String name)
	{
		for(LogicVariable x: logics)
			if(x.getName() == name)
				return x;
		return null;
	}
}
