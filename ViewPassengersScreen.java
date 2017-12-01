public class ViewPassengersScreen extends SearchScreen
{


	ViewPassengersScreen(View view)
	{
		super("Passenger Name", 3, new String[][]{{"Yes","No"},{"Yes","No"},{"Yes,No"}}, new String[]{"At Airport", "In Air", "Is High Risk"}, view);
	}

}