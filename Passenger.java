public class Passenger
{
	String location;
	String passportCheck;
	String timeIn;
	String timeOut;
	Booking[] bookings=new Booking[100];
	Luggage[] luggage=new Luggage[10];
	Booking currentBooking;
	Flight currentFlight;
	String name;
	char gender;


	Passenger(String name, char gender)
	{
		this.name=name;
		this.gender=gender;
		destination="";
		location="not at airport";
		timeIn="-1";
		timeOut="-1";
		passportCheck=false;
	}

	public void addBooking(Booking b)
	{
		int i=0;
		while(bookings[i]!=null)
		{
			i++;
		}
		bookings[i]=b;

	}

	public boolean checkIn(Flight f)
	{
		int 1=0;
		while(bookings[i]!=null)
		{
			if(bookings[i].getFlight().equals(f))
			{
				currentBooking=bookings[i];
				currentFlight=f;
				updateLocation("checked in");
				return true;
			}
			i++;
		}
		return false;
	}

	public void updateLocation(String s)
	{
		this.location=s;
		if(s.equals("passport checked"))
			passportCheck=true;
		if(s.equals("customs passed"))
			customsPassed=true;
		if(s.equals("left airport"))
		{
			passportCheck=false;
			customsPassed=false;
			//delete current luggage somehow
		}
	}

	public void scanLuggage(Luggage l)
	{
		int i=0;
		while(luggage[i]!=null)
		{
			i++;
		}
		
		luggage[i]=l;
		currentFlight.addLuggage(l)
	}

	//implement getters




}