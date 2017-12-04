import java.util.Calendar;

public class Personnel
{
	String role;
	Shift[] shifts=new Shift[100];
	Shift currentShift;
	int shiftCounter=0;
	String name;

	Personnel(String role, String name)
	{
		this.role=role;
		this.name=name;
	}

	public String getName()
	{
		return name;
	}

	public String getRole()
	{
		return role;
	}

	public void addShift(Shift s)
	{	//implement
		if (shiftCounter!=100){
			shifts[shiftCounter]=s;
			shiftCounter++;
		}
	}

	public void clockIn(Shift shift)
	{
		//should set current shift and clock-in time in that object
		//String time=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String time = Calendar.getInstance().getTime().toString();
		currentShift.clockIn(time);
	}

	public void clockOut()
	{
		//should only be possible if clocked in
		//store time in currentShift object
		//reset currentShift 
		//String time= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String time = Calendar.getInstance().getTime().toString();
		currentShift.clockOut(time);

	}
}
