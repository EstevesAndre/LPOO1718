package statistics;

import java.util.*;

public abstract class ProbabilityDistribution {

	protected static ArrayList<NormalDistribution> probs = new ArrayList<NormalDistribution>();
	
	public abstract double getMean();
	public abstract double getStddev();
	public abstract double probabilityDensityFunction(double d);
	public abstract double calcRangeProbability(int i, int j) ;
	public abstract double calcLeftProbability(double d);
	public static NormalDistribution find(String string) {
		// TODO Auto-generated method stub
		for(NormalDistribution x : probs)
			if(x.getSymbol().equals(string))
				return x;
		return null;
	}
}
