public class WaitLine
{
	int peopleInLine;
	int timeInSecondsToProcessOnePerson;
	WaitLine(int time)
	{
		peopleInLine=0;
		timeInSecondsToProcessOnePerson=time;
	}

	public void addPersonToLine()
	{
		peopleInLine++;
	}

	public int calculateWaitTimeInMinutes
	{
		return (int)((peopleInLine*timeInSecondsToProcessOnePerson)/60);
	}
}