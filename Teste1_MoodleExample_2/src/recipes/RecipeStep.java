package recipes;

import java.util.Map;
import java.util.TreeMap;

public class RecipeStep extends Ingredient{

	private String action;
	private TreeMap<Ingredient, Float> ingrs;

	public RecipeStep(String string, String string2) {
		// TODO Auto-generated constructor stub
		super(string);
		if(string == null || string2 == null)
			throw new IllegalArgumentException();

		mixed = true;
		action = string2;
		ingrs = new TreeMap<>();
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public String getAction() {
		// TODO Auto-generated method stub
		return action;
	}
	public void addIngredient(Ingredient apple, float f) {
		// TODO Auto-generated method stub
		if(!ingrs.containsKey(apple))
			ingrs.put(apple, f);

	}
	public int getIngredientCount() {
		// TODO Auto-generated method stub
		return ingrs.size();
	}
	public float getQuantity(Ingredient orange) {
		// TODO Auto-generated method stub
		for(Map.Entry<Ingredient, Float> x : ingrs.entrySet())
		{
			if(ingrs.containsKey(orange))
			{
				if(x.getKey().equals(orange))
					return x.getValue();
			}
			else {
				if(!x.getKey().equals(orange) && x.getKey().getMixed())

				{
					return x.getKey().getQuantity(orange) * x.getValue();
				}
			}
		}
		return 0;
	}

	public String toString()
	{
		String result = "to make " + name + ", " + action + " ";
		for(Map.Entry<Ingredient, Float> x : ingrs.entrySet())
		{
			result += x.getValue() + " " + x.getKey().getName() + ", ";
		}
		
		
		return result.substring(0, result.lastIndexOf(","));
	}

}
