public class Personnel
{
	String role;
	Shift[] shifts=new Shift[100];
	Shift currentShift;


	Personnel(String role)
	{
		this.role=role;
	}

	public void addShift()
	{
		//implement
	}

	public void clockIn(Shift shift)
	{
		//should set current shift and clock-in time in that object
	}

	public void clockOut()
	{
		//should only be possible if clocked in
		//store time in currentShift object
		//reset currentShift 
	}
}