public class Shift
{
	Personnel employee;
	String timeIn;
	String timeOut;
	String startTime;
	String endTime;
	String month;
	int day;

	//constructor takes employee, startTime, endTime, month, day
	public Shift(Personnel employee, String st, String et, String m, int d){
		employee=employee;
		startTime=st;
		endTime=et;
		month=m;
		day=d;
		timeIn="-1";
		timeOut="-1";
	}
	//implement clock in/out methods that set timeIn and timeOut
	public void clockIn(String time){
		timeIn=time;
	}
	public void clockOut(String time){

		if(timeIn.equals("-1")==false){
			timeOut=time;
		}

	}
}
