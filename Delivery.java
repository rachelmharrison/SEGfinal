public class Delivery
{
	String time;
	String type;
	String date;
	//v easy just make a constructor that takes all the requirements for tracking a deilvery and store them
	public Delivery(String t, String time, String date){
		type=t;
		time=time;
		date=date;
	}
	public String getTime(){
		return time;
	}
	public String getType(){
		return type;
	}
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		date=date;
	}
	public void setTime(String time){
		time=time;
	}
	public void setType(String type){
		type=type;
	}
	
}
