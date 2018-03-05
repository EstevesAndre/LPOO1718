import java.util.ArrayList;

public abstract class Facility {

	protected ArrayList<Room> rooms;

	public abstract String getName();
	public abstract String toString();
	public abstract int getCapacity();
	public boolean canEnter(User u1) {
		for(Room x : rooms)
		{
			if(x.canEnter(u1))
				return true;
		}
		return false;
	}

}
