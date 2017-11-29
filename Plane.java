public class Plane
{
	String airline;
	int idNumber;
	int seatsEconomy;
	int seatsBusiness;
	int seatsFirst;
	Flight currentFlight;
	MaintanenceLog log;

	Plane(String airline, int idNumber, int seatsFirst, int seatsBusiness, int seatsEconomy)
	{
		this.airline=airline;
		this.idNumber=idNumber;
		this.seatsEconomy=seatsEconomy;
		this.seatsBusiness=seatsBusiness;
		this.seatsFirst=seatsFirst;
	}

	//needs getters for all and setters for currentFLight and log

}