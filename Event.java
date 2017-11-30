public class Event
{
	//this one is really easy just make a constructor that takes in all the requirments from and event log and store them
	String date;
	String time;
	String category;
	String location;
	String description;
	Personnel[] guardsPresent=new Personnel[25];
	Personnel guardInCharge;
	
	
	public Event(String d,String t,String c, String l, String des, Personnel g){
		date=d;
		time=t;
		category=c;
		location=l;
		description=des;
		guardInCharge=g;
	}
	
	public void addGuard(Personnel g){
		
	}
	public void setDate(String d){
		date=d;
	}
	
	
}
