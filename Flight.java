public class Flight
{
	String origin;
	String destination;
	String arrOrDepTime;
	boolean arriving; //true if an arrival, false if a departure
	String[] foodServed=new String[100];
	Luggage[] luggage=new Luggage[500];
	Passenger[] passengers=new Passenger[500];
	String status;
	Plane plane;
	int idNumber;
	String airline;
	String airlineIdNumber;

	Flight(String origin, String destination, String time, Plane plane, int idNumber, String airline, String airlineIdNumber)
	{
		//implement
		//arriving is set by if statements inolving origin and destination airport codes
	}

	//implement getters and setters and adders