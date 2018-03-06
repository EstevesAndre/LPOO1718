package recipes;

import java.util.TreeSet;

public class Recipe {

	private String name;
	private TreeSet<Ingredient> ingrs;
	
	public Recipe(String string) {
		// TODO Auto-generated constructor stub
		name = string;
		ingrs = new TreeSet<>();
	}

	public Object getStepCount() {
		// TODO Auto-generated method stub
		return ingrs.size();
	}

	public void addStep(RecipeStep sandwich) {
		// TODO Auto-generated method stub
		ingrs.add(sandwich);
	}
	
	
}
