package recipes;

import java.util.*;

public class Recipe {

	private String nome;
	private int counter;
	private TreeSet<RecipeStep> recipes;
	
	public Recipe(String n) {
		// TODO Auto-generated constructor stub
		nome = n;
		counter = 0;
		recipes = new TreeSet<>();
	}

	public Object getStepCount() {
		// TODO Auto-generated method stub
		return counter;
	}

	public void addStep(RecipeStep sandwich) {
		// TODO Auto-generated method stub
		if(recipes.add(sandwich))
			counter++;
	}

}
