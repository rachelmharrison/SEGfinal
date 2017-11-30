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
		String[]gr=guardsPresent;
		boolean flag=true;
		int counter=0;
		while(flag){
			if(gr[counter]==null){
				gr[counter]=g;
				flag=false;
			}else{	
			counter++;
				if (counter==25){
					break;
				}
			}
		}
		guardsPresent=gr;
	}
	public void setDate(String d){
		date=d;
	}
	public String getDate(){
		return date;
	}
	
	public void setTime(String d){
		time=d;
	}
	public String getTime(){
		return time;
	}
	
	public void setCategory(String d){
		category=d;
	}
	public String getCategory(){
		return category;
	}
	
	public void setLocation(String d){
		location=d;
	}
	public String getLocation(){
		return location;
	}
	
	public Personnel[] getGuards(){
		return guardsPresent;
	}
	
}
