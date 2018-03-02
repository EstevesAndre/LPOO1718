import java.util.TreeSet;

public class Room extends Facility{
	
	private Building b;
	private String numb;
	private int floor;
	private int cap;
	private TreeSet<User> authorizedUsers;

	public Room(Building x, String number, int floor) throws DuplicateRoomException {
		// TODO Auto-generated constructor stub
		if(floor > x.getMaxFloor() || floor < x.getMinFloor()) throw new IllegalArgumentException();
		
		if(x.roomExists(number))
			throw new DuplicateRoomException();
		
		b = x;
		numb = number;
		this.floor = floor;
		cap = 0;
		b.addRoom(this);
		authorizedUsers = new TreeSet<User>();
	}

	public Room(Building x, String number, int floor, int capa) {
		// TODO Auto-generated constructor stub
		if(floor > x.getMaxFloor() || floor < x.getMinFloor()) throw new IllegalArgumentException();
		
		b = x;
		numb = number;
		this.floor = floor;
		cap = capa;
		b.addRoom(this);
		authorizedUsers = new TreeSet<User>();

	}
	
	public Building getBuilding()
	{
		return b;
	}
	public String getNumber()
	{
		return numb;
	}
	public String getName()
	{
		return b.getName() + numb;
	}
	public int getFloor()
	{
		return floor;
	}
	public int getCapacity()
	{
		return cap;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Room(" + b.getName() + "," + numb + ")";
	}
	
	public void authorize(User u)
	{
		authorizedUsers.add(u);
	}
	
	public boolean canEnter(User u)
	{
		for(User user : authorizedUsers)
		{
			if(user.equals(u))
				return true;
		}
		
		return false;
	}
	
}
