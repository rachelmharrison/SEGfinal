
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Delivery
{
	String time;
	String type;
	String date;
	//v easy just make a constructor that takes all the requirements for tracking a deilvery and store them
	public Delivery(String t){
		type=t;
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d = new Date();
		date=dateFormat.format(d);
	}

	public String getType(){
		return type;
	}
	public String getDate(){
		return date;
	}

	public void setType(String type){
		type=type;
	}
	
}
