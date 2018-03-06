package recipes;

public abstract class Ingredient implements Comparable<Ingredient> {

	protected String name;
	protected boolean mixed;
	
	public Ingredient(String string) {
		// TODO Auto-generated constructor stub
		if(string== null)
			throw new IllegalArgumentException();
		name = string;
	}
	
	public boolean getMixed()
	{
		return mixed;
	}
	
	public String getName()
	{
		return name;
	}
	
	public abstract float getQuantity(Ingredient orange); 

	 public int compareTo(Ingredient p)
	 { return this.name.compareTo(p.name); }
}
