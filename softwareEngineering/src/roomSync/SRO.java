package roomSync;
import java.util.*;

public class SRO
{
	
	//private static int tot_avai;	
	
	private static SRO sro = new SRO();
	private ArrayList<Hall> hall;
	
	private SRO()
	{
		hall = new ArrayList<Hall>();
	}
	
	public static SRO getInstance()
	{
		return sro;
	}

	private void addHall(Hall h)
	{
		if(hall.contains(h))
			System.out.println("Sorry. Hall already exists");
		else
			hall.add(h);
	}
	public int editHall(Hall h)
	{
		if(hall.contains(h))
		{
			int rooms= hall.get(hall.indexOf(h)).getNoOfDoubleRooms();
			hall.remove(h);
			hall.add(h);
			return rooms;
		}
			
		else
			hall.add(h);
		return h.getNoOfDoubleRooms();
	}
	
	
	public void createHall(String id, int capacity)
	{
		Hall h = new Hall(id, capacity);
		this.addHall(h);
	}
	
	public void removeHall(Hall h){
		hall.remove(h);
	}
	

	public void setRoomOccupants(Person a, Person b)
	{
		//Setting occupants to a SRO halls sequentially
		boolean roomsAvailable = false;
		
		for(Hall h: hall)
		{
			boolean emptyRoomFound = false;
			
			for(Room r: h.getRoom())
			{
				
				if(r.getState() instanceof RAvailable)
				{
					r.addRoomMate(a);
					r.addRoomMate(b);
					r.setState(new ROccupied());
					roomsAvailable = true;
					emptyRoomFound = true;
					break;
				}
				
			}
			if(emptyRoomFound){
				break;
			}
		}
		
		if(!roomsAvailable)
			System.out.println("Sorry. All Halls are full");
	}
	
	public int getAvailableNoOfRooms()
	{
		int tot_avai = 0;
		for(Hall h: hall)
		{
			for(Room r: h.getRoom())
			{
				if(r.getState() instanceof RAvailable)
					tot_avai++;
			}
		}
		return tot_avai;
	}
	
	//Print result
	public void getallStudents()
	{
		for(Hall h:hall)
		{
			h.getHallResidents();
		}
	}
	
	
	public void clearHallList()
	{
		hall.clear();
	}
	
	public ArrayList<Hall> getHalls(){
		return hall;
	}
}
