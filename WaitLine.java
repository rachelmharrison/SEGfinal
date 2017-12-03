public class WaitLine
{
	int peopleInLine;
	int timeInSecondsToProcessOnePerson;
	String location;
	WaitLine(int time, String location)
	{
		peopleInLine=0;
		timeInSecondsToProcessOnePerson=time;
		this.location=location;
	}

	public void addPersonToLine()
	{
		peopleInLine++;
	}

	public int calculateWaitTimeInMinutes()
	{
		return (int)((peopleInLine*timeInSecondsToProcessOnePerson)/60);
	}

	public String getLocation()
	{
		return location;
	}
}