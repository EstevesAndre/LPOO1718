package recipes;

import java.util.*;

public class OvenStep extends RecipeStep{

	
	private int temp;
	private TreeMap<SimpleIngredient, Integer> ingredients;
	
	public OvenStep(String nome, String act, int temperature) {
		// TODO Auto-generated constructor stub
		super(nome,act);
		temp = temperature;
		ingredients = new TreeMap<SimpleIngredient,Integer>();
	}


	public Object getTemperature() {
		// TODO Auto-generated method stub
		return temp;
	}

	public void addIngredient(SimpleIngredient pizza, int i) {
		// TODO Auto-generated method stub
		ingredients.put(pizza, i);
	}
	
	

}
