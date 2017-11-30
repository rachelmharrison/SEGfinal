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
	
	int lCounter=0;
	int pCounter=0;
	int fCounter=0;

	Flight(String origin, String destination, String time, Plane plane, int idNumber, String airline, String airlineIdNumber)
	{
		//implement
		//arriving is set by if statements inolving origin and destination airport codes
		origin=origin;
		destination=destination;
		arrOrDepTime=time;
		if(origin=YOW){//ottawa airport code to compare 
			arriving=false;
		}else{
			arriving=true;
		}
		plane=plane;
		idNumber=idNumber;
		airline=airline;
		airlineIdNumber=airlineIdNumber;
		status="On Time";
	}

	//implement getters and setters and adders
	//origin
	public String getOrigin(){
		return origin;
	}
	public void setOrigin(String org){
		origin=org;
	}
	//destination
	public String getDestination(){
		return destination;
	}
	public void setDestination(String dest){
		destinantion=dest;
	}	
	//status
	public String getStatus(){
		return status;
	}
	public void setStatus(String stat){
		status=stat;
	}
	//arrOrDepTime
	public String getArrOrDepTime(){
		return arrOrDepTime;
	}
	public void setArrOrDepTime(String tim){
		arrOrDepTime=tim;
	}
	//arriving
	public boolean getArriving(){
		return arriving;
	}
	public void setArriving(boolean arr){
		arriving=arr;
	}
	//foodServed
	public String[] getFoodServed(){
		return foodServed;
	}
	public void addFoodServed(String food){
		if (fCounter!=100){
			foodServed[fCounter]=food;
			fCounter++;
		}
	}
	//luggage
	public Luggage[] getluggage(){
		return luggage;
	}
	public void addLuggage(Luggage lugg){
		if (lCounter!=500){
			luggage[lCounter]=lugg;
			lCounter++;
		}
	}
	//passengers
	public Passenger[] getPassengers(){
		return passengers;
	}
	public void addPassengers(Passenger pass){
		if (pCounter!=500){
			passengers[pCounter]=pass;
			pCounter++;
		}
	}
	//plane
	public Plane getPlane(){
		return plane;
	}
	public void setPlane(Plane plan){
		plane=plan;
	}
	//idNumber
	public int getIdNumber(){
		return idNumber;
	}
	public void setIdNumber(int id){
		idNumber=id;
	}
	//airline
	public String getAirline(){
		return airline;
	}
	public void setAirline(String air){
		airline=air;
	}
	//airlineIdNumber
	public String getAirlineIdNumber(){
		return airlineIdNumber;
	}
	public void setIdAirlineNumber(String air){
		airlineIdNumber=air;
	}
	
}
