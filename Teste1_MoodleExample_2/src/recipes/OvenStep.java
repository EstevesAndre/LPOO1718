package recipes;

import java.util.TreeMap;

public class OvenStep extends RecipeStep {

	private int temp;
	private TreeMap<SimpleIngredient, Float> ingrs;
	
	public OvenStep(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
		
		super(string,string2);
		temp = i;
		ingrs = new TreeMap<>();
	}

	public void addIngredient(SimpleIngredient pizza, float i) {
		// TODO Auto-generated method stub
		if(!ingrs.containsKey(pizza))
			ingrs.put(pizza, i);
	}

	
	public int getTemperature() {
		// TODO Auto-generated method stub
		return temp;
	}
	
	
	

}
