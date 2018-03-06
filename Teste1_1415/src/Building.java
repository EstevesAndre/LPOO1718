import java.util.ArrayList;

public class Building extends Facility {

	private String name;
	private int min,max;
	private ArrayList<Room> rooms;
	
	public Building(String name, int min, int max) {
		// TODO Auto-generated constructor stub
		if(min > max) throw new IllegalArgumentException();
		
		this.name = name;
		this.min = min;
		this.max = max;
		rooms = new ArrayList<Room>();
	}
	public Building(String name, int min, int max, int capa) {
		// TODO Auto-generated constructor stub
		if(min > max) throw new IllegalArgumentException();
		
		this.name = name;
		this.min = min;
		this.max = max;

	}
	
	public String getName()
	{
		return name;
	}
	public int getMinFloor()
	{
		return min;
	}
	public int getMaxFloor()
	{
		return max;
	}
	
	@Override
	public String toString() {
		return "Building(" + name + ")";
	}
	
	public boolean canEnter(User u)
	{
		for(Room room : rooms)
		{
			if(room.canEnter(u))
				return true;
		}
		
		return false;
	}
	
	public void addRoom(Room r)
	{
		rooms.add(r);
	}
	
	public boolean roomExists(String number)
	{
		for(Room room : rooms)
		{
			if(room.getNumber() == number)
				return true;
		}
		
		return false;
	}
	
	public int getCapacity()
	{
		int sum = 0;
		
		for(Room room : rooms)
			sum+=room.getCapacity();
		
		return sum;
	}

	

}
