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
	boolean tracing=true;

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

		
		flights[0]=new Flight("YYZ","YOW","15:05",plane1, 0001, "Air Canada", "AC200","2017/12/03");
		flights[1]=new Flight("YHZ","YOW","15:20",plane2, 0002, "West Jet", "WJ345","2017/12/03");
		flights[2]=new Flight("YOW","YTZ","15:35",plane3, 0003, "Porter", "P678","2017/12/03");
		flights[3]=new Flight("YUL","YOW","15:40",plane4, 0004, "Air Canada", "AC453","2017/12/03");
		flights[4]=new Flight("YOW","ERW","15:45",plane5, 0005, "United", "UN218","2017/12/03");

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

		employees[0]=new Personnel("Security", "Tom Anderson");
		employees[1]=new Personnel("Security", "Jane Jones");
		employees[2]=new Personnel("Airline", "Richard Davis");

		Shift[] shift=new Shift[9];
		shift[0]=new Shift(employees[0], "13:00", "21:00", "December", 4);
		shift[1]=new Shift(employees[0], "13:00", "21:00", "December", 5);
		shift[2]=new Shift(employees[0], "13:00", "21:00", "December", 6);
		shift[3]=new Shift(employees[1], "13:00", "21:00", "December", 4);
		shift[4]=new Shift(employees[1], "13:00", "21:00", "December", 5);
		shift[5]=new Shift(employees[1], "13:00", "21:00", "December", 6);
		shift[6]=new Shift(employees[2], "13:00", "21:00", "December", 4);
		shift[7]=new Shift(employees[2], "13:00", "21:00", "December", 5);
		shift[8]=new Shift(employees[2], "13:00", "21:00", "December", 6);

		employees[0].addShift(shift[0]);
		employees[0].addShift(shift[1]);
		employees[0].addShift(shift[2]);
		employees[1].addShift(shift[3]);
		employees[1].addShift(shift[4]);
		employees[1].addShift(shift[5]);
		employees[2].addShift(shift[6]);
		employees[2].addShift(shift[7]);
		employees[2].addShift(shift[8]);

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
			i++;
		}
		return false;
	}
		
	public String getCurrentUserName()
	{
		return currentUser.getName();
	}

	public boolean checkForEmail(String s)
	{
		int i=0;
		while(accounts[i]!=null)
		{
			if(accounts[i].getEmail()==s)
				return true;
			i++;
		}
		return false;
	}

	public void createAccount(String u, String p, String n, String r, String d, char g, String e)
	{
		int i=0;
		while(accounts[i]!=null)
		{
			i++;
		}
		if(r.equals("Passenger"))
		{
			int x=0;
			while(passengers[x]!=null)
			{
				x++;
			}
			passengers[x]=new Passenger(n,g,d);
			accounts[i]=new UserAccount(u,p,passengers[x],e);
		}
		else if(r.equals("Employee"))
		{
			int x=0;
			while(employees[x]!=null)
			{
				x++;
			}
			employees[x]=new Personnel("",n);
			accounts[i]=new UserAccount(u,p,employees[x],e);
		}
		else if(r.equals("Admin"))
		{
			int x=0;
			while(admins[x]!=null)
			{
				x++;
			}
			admins[x]=new Admin(n);
			accounts[i]=new UserAccount(u,p,admins[x],e);

		}

	}

	public boolean validateUser(String u, char[] p)
	{
		String temp="";
		char[] p2=p;
		for(int x=0; x<p2.length; x++)
			{
				temp+=p2[x];
			}
			
		//if(tracing)System.out.println(temp+" "+accounts[0].getPassword());
		int i=0;
		while(accounts[i]!=null)
		{
			if(tracing)System.out.println(u+" "+accounts[i].getUsername());
			if(tracing)System.out.println(temp+" "+accounts[i].getPassword());
			if (accounts[i].getUsername().equals(u) && accounts[i].getPassword().equals(temp))
			{
				
				currentUser=accounts[i];
				return true;
			}
			i++;
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

	public Flight findFlight(String id)
	{

		int i=0;
		while(flights[i]!=null)
		{
			if(tracing)System.out.println(flights[i].getAirlineIdNumber());

			if(flights[i].getAirlineIdNumber().equals(id))
			{
				
				return flights[i];
			}
			i++;
		}


		return null;
	}

	public Event findEvent(String cat, String date)
	{
		if(tracing)System.out.println("find flight running");
		int i=0;
		while(events[i]!=null)
		{
			if(events[i].getCategory().equals(cat)&& events[i].getDate().equals(date))
				return events[i];
			i++;
		}

		return null;

	}

	public Personnel findGuard(String name)
	{
		int i=0;
		while(employees[i]!=null)
		{
			if(employees[i].getName().equals(name) && employees[i].getRole().equalsIgnoreCase("Security"))
			{
				return employees[i];
			}
			i++;
		}
		return null;
	}

	public void createEvent(String category, String date, String location, String description, Personnel guard)
	{
		int i=0;
		while(events[i]!=null)
		{
			i++;
		}
		events[i]=new Event(date, category, location, description, guard);
	}

	public Personnel findEmployee(String name)
	{
		int i=0;
		while(employees[i]!=null)
		{
			if(employees[i].getName().equals(name))
			{
				return employees[i];
			}
			i++;
		}
		return null;
	}



}