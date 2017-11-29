public class CameraFeed
{
	String location;
	boolean eventTriggered;

	//constructor needs to take only the location
	public CameraFeed(String location){
		location=location;
	}
	
	public String getLocation(){
		return location;
	}
	public void setLocation(String loc){
		location=loc;
	}
	
	public boolean getEventTriggered(){
		return eventTriggered;
	}
	public void setEventTriggered(boolean trig){
		eventTriggered=trig;
	}
	
}
