import java.util.*;

public class Building extends Facility{

	private String name;
	private int minF, maxF;
	
	public Building(String nome, int min, int max) {
		// TODO Auto-generated constructor stub
		if(min > max)
			throw new IllegalArgumentException();
		name = nome;
		minF = min;
		maxF = max;
		rooms = new ArrayList<>();
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getMinFloor() {
		// TODO Auto-generated method stub
		return minF;
	}

	public int getMaxFloor() {
		// TODO Auto-generated method stub
		return maxF;
	}

	public ArrayList<Room> getRooms()
	{
		return rooms;
	}

	public void addRoom(Room r)
	{
		rooms.add(r);
	}
	public String toString()
	{
		return "Building(" + name + ")";
	}


	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		int c = 0;
		for(Room x : rooms)
			c+= x.getCapacity(); 
		return c;
	}

	public boolean roomExists(String numb)
	{
		for(Room x : rooms)
			if(x.getNumber().equals(numb))
				return true;
		return false;
	}
}
