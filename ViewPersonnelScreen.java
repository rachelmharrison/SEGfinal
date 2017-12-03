public class ViewPersonnelScreen extends SearchScreen
{
	

	ViewPersonnelScreen(View view)
	{
		super("Employee Name:", 2, new String[][]{{"Yes","No"},{"Airline","Luggage","Cleaning","Catering","Shops","Security"}}, new String[]{"At Work", "Service"}, view);
		
	}

}