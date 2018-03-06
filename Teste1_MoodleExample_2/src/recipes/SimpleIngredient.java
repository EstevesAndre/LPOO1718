package recipes;

public class SimpleIngredient extends Ingredient {
	
	public SimpleIngredient(String string) {
		// TODO Auto-generated constructor stub
		super(string);
		mixed = false;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public boolean equals(Object t2)
	 { return t2 != null && t2 instanceof SimpleIngredient &&
	 this.name.equals(((SimpleIngredient)t2).name); }

	@Override
	public float getQuantity(Ingredient orange) {
		// TODO Auto-generated method stub
		return 0;
	} 
	
	public String toString()
	{
		return name;
	}


}
