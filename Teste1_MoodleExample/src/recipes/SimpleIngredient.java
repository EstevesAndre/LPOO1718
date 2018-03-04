package recipes;

public class SimpleIngredient extends Ingredient implements Comparable<SimpleIngredient>{

	private String name;
	
	public SimpleIngredient(String nome) {
		// TODO Auto-generated constructor stub
		if(nome == null)
			throw new IllegalArgumentException();
		
		name = nome;
	}

	public String getName()
	{
		return name;
	}
	
	 public boolean equals(Object t2)
	 { return t2 != null && t2 instanceof SimpleIngredient &&
	 		this.name.equals(((SimpleIngredient)t2).name); }
	 
	 public int compareTo(SimpleIngredient p)
	 {
		return this.name.compareTo(p.getName());
	 } 
	 
	 public String toString()
	 {
		 return name;
	 }
}
