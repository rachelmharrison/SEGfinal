public class Luggage
{
	String location;
	boolean isLost;
	Passenger passenger;
	Flight flight;
	int weight;

	Luggage(Passenger passenger, Flight flight, int weight)
	{
		//implement
		//isLost should be set to false initially, location should be "checked in"
		isLost=false;
		this.passenger=passenger;
		this.flight=flight;
		this.weight=weight;
		this.location="checked in";
		
		
	}

	//implement getters and a setter for isLost and location
	
	public boolean getIsLost(){
		return isLost;
	}
	public void setIsLost(boolean lost){
		isLost=lost;
	}
	
	public String getLocation(){//send me your location-Khalid
		return location;
	}
	public void setLocation(String loc){
		location=loc;
	}

	public String getPassengerName()
	{
		return passenger.getName();
	}

}
