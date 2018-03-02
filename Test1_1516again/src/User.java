
public class User implements Comparable<User>{

	private String name;
	
	public User(String nome) {
		// TODO Auto-generated constructor stub
		name = nome;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean equals(User u2)
	{
		return name.equals(u2.getName());
	}
	
	public int compareTo(User u2)
	{
		return name.compareTo(u2.getName());
	}

}
