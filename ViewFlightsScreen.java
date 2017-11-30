public class ViewFlightsScreen extends SearchScreen
{
	String category="ID Number:";
	int n=3;
	String[][] m=new String[3][3];
	m[0][0]="Yes";
	m[0][1]="No";
	m[1][0]="Arriving";
	m[1][1]="Departing";
	m[2][0]="Price";
	m[2][1]="Origin/Destination";
	m[2][2]="Time";


	String[] s={"Seats Available", "Arr/Dep", "Sort By"};

	ViewFlightsScreen(View view)
	{
		super(category, n, m, s, view);
	}

}