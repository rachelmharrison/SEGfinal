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
		String[]food=foodServed;
		boolean flag=true;
		int counter=0;
		while(flag){
			if(food[counter]==null){
				food[counter]=food;
				flag=false;
			}else{	
			counter++;
				if (counter==100){
					break;
				}
			}
		}
		foodServed=food;
	}
	//luggage
	public Luggage[] getluggage(){
		return luggage;
	}
	public void addLuggage(String lugg){
		Luggage[]lugg=luggage;
		boolean flag=true;
		int counter=0;
		while(flag){
			if(lugg[counter]==null){
				lugg[counter]=lugg;
				lugg=false;
			}else{	
			counter++;
				if (counter==500){
					break;
				}
			}
		}
		luggage=lugg;
	}
	//passengers
	public Passenger[] getPassengers(){
		return passengers;
	}
	public void addPassengers(String pass){
		Passenger[]pass=passengers;
		boolean flag=true;
		int counter=0;
		while(flag){
			if(pass[counter]==null){
				pass[counter]=pass;
				flag=false;
			}else{	
			counter++;
				if (counter==500){
					break;
				}
			}
		}
		passengers=pass;
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
