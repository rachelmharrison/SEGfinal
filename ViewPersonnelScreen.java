public class ViewPersonnelScreen extends SearchScreen
{
	String category="Employee Name:";
	int n=3;
	String[][] m=new String[3][6];
	m[0][0]="Yes";
	m[0][1]="No";
	m[1][0]="Airline Staff";
	m[1][1]="Luggage";
	m[1][2]="Cleaning";
	m[1][3]="Catering";
	m[1][4]="Shops";
	m[1][5]="Security";

	String[] s={"At Work", "Service"};

	ViewPersonnelScreen(View view)
	{
		super(category, n, m, s, view);
	}

}