import java.util.TreeSet;

public class Room extends Facility {

	private Building building;
	private String number;
	private int floor;
	private int capac;
	private TreeSet<User> authorizedUsers;
	
	public Room(Building buil, String numb, int flr) throws DuplicateRoomException {
		// TODO Auto-generated constructor stub
		if(flr > buil.getMaxFloor() || flr < buil.getMinFloor())
		{
			throw new IllegalArgumentException();
		}
		if(buil.roomExists(numb))
			throw new DuplicateRoomException();
		
		building = buil;
		number = numb;
		floor = flr;
		capac = 0;
		buil.addRoom(this);
		authorizedUsers = new TreeSet<User>();
	}
	public Room(Building buil, String numb, int flr, int cap) throws DuplicateRoomException {
		// TODO Auto-generated constructor stub
		if(flr > buil.getMaxFloor() || flr < buil.getMinFloor())
		{
			throw new IllegalArgumentException();
		}
		if(buil.roomExists(numb))
			throw new DuplicateRoomException();
		
		building = buil;
		number = numb;
		floor = flr;
		capac = cap;
		buil.addRoom(this);
		authorizedUsers = new TreeSet<User>();
	}
	
	public int getCapacity()
	{
		return capac;
	}
	
	public void authorize(User u)
	{
		authorizedUsers.add(u);
	}
	
	public boolean canEnter(User u)
	{
		return authorizedUsers.contains(u);
	}

	public Building getBuilding() {
		return building;
	}
	public String getNumber()
	{
		return number;
	}
	public int getFloor()
	{
		return floor;
	}
	public String getName() {
		return building.getName() + number;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Room(" + building.getName() + "," + number + ")";
	}
	

}
