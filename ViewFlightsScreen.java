public class ViewFlightsScreen extends SearchScreen
{
	

	ViewFlightsScreen(View view)
	{
		super("ID Number:", 3, new String[][]{{"Yes","No"},{"Arriving","Departing"},{"Price","Origin/Destination","Time"}}, new String[]{"Seats Available", "Arr/Dep", "Sort By"}, view);
	}

}