public class Plane
{
	String airline;
	int idNumber;
	String type;
	int seatsEconomy;
	int seatsBusiness;
	int seatsFirst;
	Flight currentFlight;
	MaintanenceLog log;

	Plane(String airline, int idNumber, int seatsFirst, int seatsBusiness, int seatsEconomy String type)
	{
		this.airline=airline;
		this.idNumber=idNumber;
		this.seatsEconomy=seatsEconomy;
		this.seatsBusiness=seatsBusiness;
		this.seatsFirst=seatsFirst;
		this.type=type;
	}

	//needs getters for all and setters for currentFLight and log
	public int getIdNumber(){
		return idNumber;
	}
	public int getSeatsEconomy(){
		return seatsEconomy;
	}
	public int getSeatsBusiness(){
		return seatsBusiness;
	}
	public int getSeatsFirst(){
		return seatsFirst;
	}
	public int getAirline(){
		return airline;
	}
	public MaintanenceLog getLog(){
		return log;
	}
	public Flight getCurrentFlight(){
		return currentFlight;
	}

	public void setCurrentFlight(Flight flight){
		currentFlight=flight;
	}
	public void setLog(MaintanenceLog l){
		log=l;
	}
}