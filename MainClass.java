public class MainClass //don't touch this one
{
	public static void main(String args[])
	{
		MainClass system = new MainClass();
	}

	UserAccount[] accounts=new UserAccount[100];
	Passenger[] passengers=new Passenger[100];
	Flight[] flights=new Flight[100];
	Luggage[] luggage=new Luggage[100];
	Event[] events=new Event[100];
	WaitLine[] waitLines=new WaitLine[100];
	Delivery[] deliveries=new Delivery[100];
	Personnel[] employees=new Personnel[100];
	Admin[] admins=new Admin[100];
	UserAccount currentUser;
	Service[] services=new Service[100];

	MainClass()
	{
		Admin admin1=new Admin("Rachel");
		Admin admin2=new Admin("Alanna");
		Admin admin3=new Admin("Simone");

		accounts[0]=new UserAccount("rachel","password1", admin1,"rachel@gmail.com");
		accounts[1]=new UserAccount("alanna","password2", admin2, "alanna@gmail.com");
		accounts[2]=new UserAccount("simone","password3", admin3, "simone@gmail.com");

		Plane plane1=new Plane("Air Canada",0001, 30, 100, 500, "B707");
		Plane plane2=new Plane("West Jet",0002, 0, 100, 200, "AB200");
		Plane plane3=new Plane("Porter",0003, 0, 0, 100, "AB100");
		Plane plane4=new Plane("Air Canada",0004, 0, 100, 200, "AB200");
		Plane plane5=new Plane("United",0005, 30, 100, 500, "B707");

		
		flights[0]=new Flight("YYZ","YOW","15:05",plane1, 0001, "Air Canada", "AC200");
		flights[1]=new Flight("YHZ","YOW","15:20",plane2, 0002, "West Jet", "WJ345");
		flights[2]=new Flight("YOW","YTZ","15:35",plane3, 0003, "Porter", "P678");
		flights[3]=new Flight("YUL","YOW","15:40",plane4, 0004, "Air Canada", "AC453");
		flights[4]=new Flight("YOW","ERW","15:45",plane5, 0005, "United", "UN218");

		Booking booking1=new Booking(flights[0], "2A", "First Class");
		Booking booking2=new Booking(flights[1], "29D", "Economy Class");
		Booking booking3=new Booking(flights[2], "10B", "Economy Class");
		Booking booking4=new Booking(flights[3], "8D", "Economy Class");
		Booking booking5=new Booking(flights[4], "12C", "Business Class");

		passengers[0]=new Passenger("John Smith", 'M', "1965/07/04");
		passengers[1]=new Passenger("Karen DeLuca", 'F', "1987/11/23");
		passengers[2]=new Passenger("George Williams", 'M', "1992/08/13");
		passengers[3]=new Passenger("Emily Johnstone", 'F', "1954/02/15");
		passengers[4]=new Passenger("Susanne Cook", 'F', "1969/03/28");

		passengers[0].addBooking(booking1);
		passengers[1].addBooking(booking2);
		passengers[2].addBooking(booking3);
		passengers[3].addBooking(booking4);
		passengers[4].addBooking(booking5);

		View view = new View(this);
	}

//	public void addPassenger(Passenger p)
	{
		//implement this and all other adder methods
	}

	public boolean checkForUsername(String s)
	{
		int i=0;
		while(accounts[i]!=null)
		{
			if(accounts[i].getUsername()==s)
				return true;
		}
		return false;
	}
		

	public boolean checkForEmail(String s)
	{
		int i=0;
		while(accounts[i]!=null)
		{
			if(accounts[i].getEmail()==s)
				return true;
		}
		return false;
	}

	public void createAccount(String u, String p, String n, String r, String d, char g, String e)
	{

	}

	public boolean validateUser(String u, String p)
	{
		int i=0;
		while(accounts[i]!=null)
		{
			if(accounts[i].getUsername()==u && accounts[i].getPassword()==p)
			{
				currentUser=accounts[i];
				return true;
			}
		}
		return false;
	}

	public String getCurrentAccountType()
	{
		return currentUser.getRole();
	}

	public Flight[] getFlights()
	{
		return flights;
	}

	public Passenger[] getPassengers()
	{
		return passengers;
	}

	public Luggage[] getLuggage()
	{
		return luggage;
	}

	public Personnel[] getPersonnel()
	{
		return employees;
	}

	public Delivery[] getDeilveries()
	{
		return deliveries;
	}

	public WaitLine[] getWaitLines()
	{
		return waitLines;
	}

	public Event[] getEventLogs()
	{
		return events;
	}

	public String[] flightsToString()
	{
		int counter=0;
		while(flights[counter]!=null)
			counter++;

		String[] s=new String[counter];

		for(int i=0; i<counter; i++)
		{
			s[i]=flights[i].getAirlineIdNumber()+" "+flights[i].getOrigin()+"-"+flights[i].getDestination()+" "+flights[i].getTime();
		}

		return s;
	}

	public String[] passengersToString()
	{
		int counter=0;
		while(passengers[counter]!=null)
			counter++;

		String[] s=new String[counter];

		for(int i=0; i<counter; i++)
		{
			s[i]=passengers[i].getName();
		}

		return s;
	}

	public String[] luggageToString()
	{
		int counter=0;
		while(luggage[counter]!=null)
			counter++;

		String[] s=new String[counter];

		for(int i=0; i<counter; i++)
		{
			s[i]=luggage[i].getPassengerName()+" Luggage";
		}

		return s;
	}

	public String[] personnelToString()
	{
		int counter=0;
		while(employees[counter]!=null)
			counter++;

		String[] s=new String[counter];

		for(int i=0; i<counter; i++)
		{
			s[i]=employees[i].getName();
		}

		return s;
	}

	public String[] servicesToString()
	{
		int counter=0;
		while(services[counter]!=null)
			counter++;

		String[] s=new String[counter];

		for(int i=0; i<counter; i++)
		{
			s[i]=services[i].getName();
		}

		return s;
	}

	public String[] deliveriesToString()
	{
		int counter=0;
		while(deliveries[counter]!=null)
			counter++;

		String[] s=new String[counter];

		for(int i=0; i<counter; i++)
		{
			s[i]=deliveries[i].getType()+" "+deliveries[i].getDate();
		}

		return s;
	}

	public String[] waitLinesToString()
	{
		int counter=0;
		while(waitLines[counter]!=null)
			counter++;

		String[] s=new String[counter];

		for(int i=0; i<counter; i++)
		{
			s[i]=waitLines[i].getLocation();
		}

		return s;
	}

	public String[] eventsToString()
	{
		int counter=0;
		while(events[counter]!=null)
			counter++;

		String[] s=new String[counter];

		for(int i=0; i<counter; i++)
		{
			s[i]=events[i].getCategory()+" "+events[i].getDate();
		}

		return s;
	}



}