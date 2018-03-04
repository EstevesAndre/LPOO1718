package recipes;

import java.util.*;

public class RecipeStep implements Comparable<RecipeStep> {

	private String name,action;
	private TreeMap<Ingredient, Float> ingredients;
	private TreeMap<RecipeStep, Float> multiple_ingredients;
	private TreeMap<Ingredient, Float> collective;
	
	public RecipeStep(String nome, String action) {
		// TODO Auto-generated constructor stub
		if(nome == null || action == null)
			throw new IllegalArgumentException();
		name = nome;
		this.action = action;
		ingredients = new TreeMap<>();
		this.multiple_ingredients = new TreeMap<>();
		collective = new TreeMap<>();
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public Object getAction() {
		// TODO Auto-generated method stub
		return action;
	}

	public TreeMap<Ingredient, Float> getIngredients()
	{
		return ingredients;
	}

	public boolean equals(Object t2)
	{ return t2 != null && t2 instanceof RecipeStep &&
	this.name.equals(((RecipeStep)t2).name);
	}

	public int compareTo(RecipeStep t2)
	{
		return this.name.compareTo(((RecipeStep)t2).getName());
	}


	public void addIngredient(Ingredient apple, float f) {
		// TODO Auto-generated method stub
		if(!ingredients.containsKey(apple))
			ingredients.put(apple, f);
	}


	public void addIngredient(RecipeStep mixed, float qnt)
	{
		if(!this.multiple_ingredients.containsKey(mixed)) 
		{
			multiple_ingredients.put(mixed, qnt);
			TreeMap<Ingredient, Float> mixedIngr = mixed.getIngredients();
			for(Map.Entry<Ingredient, Float> e : mixedIngr.entrySet())
			{
				collective.put(e.getKey(), qnt * e.getValue());
			}
		}
	}

	public Object getIngredientCount() {
		// TODO Auto-generated method stub
		return ingredients.size();
	}

	public float getQuantity(Ingredient orange) {
		// TODO Auto-generated method stub
		for(Map.Entry<Ingredient, Float> e : ingredients.entrySet())
		{
			if(e.getKey().equals(orange))
				return e.getValue();
		}
		for(Map.Entry<Ingredient, Float> e : collective.entrySet())
		{
			if(e.getKey().equals(orange))
				return e.getValue();
		}
		
		return 0;
	}

	public float getQuantity(RecipeStep mixedFruits) {
		// TODO Auto-generated method stub
		for(Map.Entry<RecipeStep, Float> e: multiple_ingredients.entrySet())
		{
			if(e.getKey().equals(mixedFruits))
				return e.getValue();
		}

		return 0;
	}
	

	public String toString()
	{
		String result = "to make " + name + ", " + action + " ";
		
		TreeMap<Ingredient, Float> allIngr = collective;
		allIngr.putAll(ingredients);
		boolean done = false;
		for(Map.Entry<Ingredient, Float> e : allIngr.entrySet())
		{
			if(ingredients.containsKey(e.getKey()))
				result += e.getValue() + " " + e.getKey() + ", ";
			else if(done == false)
			{
				result += this.multiple_ingredients.firstEntry().getValue() + " " + this.multiple_ingredients.firstEntry().getKey().getName() + ", ";
				done = true;
			}	
		}		
		return result.substring(0, result.lastIndexOf(","));
	}

}
