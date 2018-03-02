import java.util.ArrayList;

public class Building extends Facility {

	private String name;
	private int min,max;
	private ArrayList<Room> rooms;
	
	public Building(String n, int mi, int ma) {
		// TODO Auto-generated constructor stub
		if(mi > ma) throw new IllegalArgumentException();
		name = n;
		min = mi;
		max = ma;
		rooms = new ArrayList<Room>();
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
		// TODO Auto-generated method stub
		
		return "Building(" + name + ")";
	}	
	
	public void addRoom(Room r)
	{
		rooms.add(r);
	}
	
	public int getCapacity()
	{
		int val = 0;
		for(Room x: rooms)
			val += x.getCapacity();
		return val;
	}
	
	public boolean roomExists(String number)
	{
		for(Room x: rooms)
			if(x.getNumber().equals(number))
				return true;
		return false;
	}

	@Override
	public boolean canEnter(User u) {
		// TODO Auto-generated method stub
		for(Room x: rooms)
			if(x.canEnter(u))
				return true;
		return false;
	}

}
