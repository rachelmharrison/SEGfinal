public class ViewPersonnelScreen extends SearchScreen
{
	String category="Passenger Name:";
	int n=3;
	String[][] m=new String[3][2];
	m[0][0]="Yes";
	m[0][1]="No";
	m[1][0]="Yes";
	m[1][1]="No";
	m[2][0]="Yes";
	m[2][1]="No";

	String[] s={"At Airport", "In Air", "Is High Risk"};

	ViewPassengersScreen(View view)
	{
		super(category, n, m, s, view);
	}

}