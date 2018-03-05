
public class User {

	private String name;

	public User(String string) {
		// TODO Auto-generated constructor stub
		name = string;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (obj == null || ! (obj instanceof User)) return false;
		else return this.name.equals(((User)obj).name);
	} 

}
