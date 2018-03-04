package statistics;

public class NormalDistribution extends ProbabilityDistribution {

	private double mean, stddev;
	private static final double prob2sigma = 0.477250; 	
	private String symb;
	
	public NormalDistribution(double mean, double stddev) {
		// TODO Auto-generated constructor stub
		if(mean == 0 && stddev == 0)
			throw new IllegalArgumentException();

		this.mean = mean;
		this.stddev = stddev;
	}
	
	public NormalDistribution(String val, double mean, double stddev) {
		// TODO Auto-generated constructor stub
		if(mean == 0 && stddev == 0)
			throw new IllegalArgumentException();

		this.mean = mean;
		this.stddev = stddev;
		probs.add(this);
		symb = val;
	}

	public NormalDistribution() {
		// TODO Auto-generated constructor stub
		mean = 0.0;
		stddev = 1.0;
	}


	public double getMean()
	{
		return mean;
	}
	public double getStddev()
	{
		return stddev;
	}
	public String getSymbol()
	{
		return symb;
	}

	@Override
	public double probabilityDensityFunction(double d) {
		// TODO Auto-generated method stub
		return (1 / Math.pow(2*Math.PI, 0.50))*Math.exp(-0.5 * d * d);
	}


	@Override
	// graphic link: [https://en.wikipedia.org/wiki/File:Empirical_Rule.PNG]
	public double calcRangeProbability(int i, int j) {
		// TODO Auto-generated method stub

		// simplest way 
		// return (Math.abs(b-a) / 2) * prob2sigma;


		if(i >= j)
			return 0.0;

		double result = 0.0;

		if(mean >= i && mean <= j)
		{
			if(mean - i == stddev)			
				result += 0.3413;
			else if(mean - i == 2 * stddev)			
				result += prob2sigma;			
			else if(mean - i == 3* stddev)
				result += 0.4987;

			if(j - mean == stddev)			
				result += 0.3413;
			else if(j - mean == 2 * stddev)			
				result += prob2sigma;			
			else if(j - mean == 3* stddev)
				result += 0.4987;

		}
		else if( mean >= j)
		{

			if(mean - j == stddev)			
				result += (0.5 - 0.3413);
			else if(mean - j == 2 * stddev)			
				result += (0.5 - prob2sigma);			
			else if(mean - j == 3* stddev)
				result += (0.5 - 0.4987);

			if(mean - j == stddev)			
				result -= 0.3413;
			else if(mean - j == 2 * stddev)			
				result -= prob2sigma;			
			else if(mean - j == 3* stddev)
				result -= 0.4987;
		}
		else
		{

			if(i- mean == stddev)			
				result -= 0.3413;
			else if(i -mean == 2 * stddev)			
				result -= prob2sigma;			
			else if(i- mean == 3* stddev)
				result -= 0.4987;

			if(j - mean == stddev)			
				result += 0.3413;
			else if(j - mean == 2 * stddev)			
				result += prob2sigma;			
			else if(j - mean == 3* stddev)
				result += 0.4987;
		}

		return result;
	}




	@Override
	public double calcLeftProbability(double d) {
		// TODO Auto-generated method stub
		if(d > mean && d - mean == 2 * stddev)
			return 0.5 + prob2sigma;
		else if(d < mean && mean - d == 2*stddev)
			return 0.5-prob2sigma;
		return 0.5;
	}
	 public boolean equals(Object t2)
	 { return t2 != null && t2 instanceof NormalDistribution &&
	 this.mean == (((NormalDistribution)t2).getMean()) &&
	this.stddev == ((NormalDistribution)t2).getStddev(); } 

	 public String toString()
	 {
		 return "N(" + mean + ", " + stddev + ")";
	 }
}
