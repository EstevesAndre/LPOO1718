package circuits;

import java.util.*;

public class CombinatorialCircuit {
	
	private ArrayList<LogicVariable> var;
	
	public CombinatorialCircuit()
	{
		var = new ArrayList<>();
	}

	public boolean addVariable(LogicVariable a) {
		// TODO Auto-generated method stub
		if( var.contains(a))
			return false;
		var.add(a);
		return true;
	}

	public LogicVariable getVariableByName(String string) {
		// TODO Auto-generated method stub
		for(LogicVariable x : var)
			if(x.getName().equals(string))
				return x;
		return null;
	}
	
	
}
