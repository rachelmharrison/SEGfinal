public class Booking
{
	Flight flight;
	int carryOnAllowed;
	int checkBagsAllowed;
	int carryOnWeight;
	int checkedBagWeight;
	String seat;
	String seatClass;


	Booking(Flight f, String s, String c)
	{
		//implement, seat should be -1 if still unassigned, assign luggage variables based on class
		flight=f;
		seat=-1;
		seatClass=c;//what are the different claases 
		if(seatClass=="First Class"){
			carryOnAllowed=3;
			checkBagsAllowed=3;
			carryOnWeight=50;
			checkedBagWeight=20;
		}
		if(seatClass=="Business Class"){
			carryOnAllowed=2;
			checkBagsAllowed=2;
			carryOnWeight=50;
			checkedBagWeight=20;
		}
		if(seatClass=="Economy Class"){
			carryOnAllowed=1;
			checkBagsAllowed=2;
			carryOneWeight=50;
			checkedBagWeight=20;
		}
	}

	//implement getter and the setter for seat
	public String getSeat(){
		return seat;
	}
	public void setSeat(String seat){
		seat=seat;
	}

	public Flight getFlight(){
		return flight;
	}
}
