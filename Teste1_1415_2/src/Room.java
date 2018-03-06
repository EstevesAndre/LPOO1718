import java.util.*;

public class Room extends Facility {

	private Building build;
	private String numb;
	private int floor;
	private int capacity;
	private ArrayList<User> permis;
	
	public Room(Building b, String string, int i) throws DuplicateRoomException{
		// TODO Auto-generated constructor stub
		if(i < b.getMinFloor() || i > b.getMaxFloor())
			throw new IllegalArgumentException();
		if(b.roomExists(string))
			throw new DuplicateRoomException();
		build = b;
		numb = string;
		floor = i;
		this.capacity = 0;
		b.addRoom(this);
		permis = new ArrayList<>();
	}

	public Room(Building b, String string, int i, int capa) throws DuplicateRoomException{
		// TODO Auto-generated constructor stub
		if(i < b.getMinFloor() || i > b.getMaxFloor())
			throw new IllegalArgumentException();
		if(b.roomExists(string))
			throw new DuplicateRoomException();

		build = b;
		numb = string;
		floor = i;
		this.capacity = capa;
		b.addRoom(this);
		permis = new ArrayList<>();
	}

	public Building getBuilding() {
		// TODO Auto-generated method stub
		return build;
	}

	public String getNumber() {
		// TODO Auto-generated method stub
		return numb;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return build.getName() + numb;
	}

	public int getFloor() {
		// TODO Auto-generated method stub
		return floor;
	}

	public boolean equals(Object obj) {
		if (obj == null || ! (obj instanceof Room)) return false;
		else return this.numb.equals(((Room)obj).getNumber());
	} 

	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Room(" + build.getName() + "," + numb + ")";
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		return capacity;
	}

	public void authorize(User u1) {
		// TODO Auto-generated method stub
		this.permis.add(u1);
	}

	public boolean canEnter(User u1) {
		// TODO Auto-generated method stub
		for(User u: permis)
			if(u.getName().equals(u1.getName()))
				return true;
		return false;
	}

}
