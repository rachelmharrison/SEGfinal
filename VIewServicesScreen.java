public class ViewServicesScreen extends SearchScreen
{
	String category="Service Name:";
	int n=1;
	String[][] m=new String[1][3];
	m[0][0]="Shop";
	m[0][1]="Catering";
	m[0][0]="Cleaning";

	String[] s={"Type"};

	ViewServicesScreen(View view)
	{
		super(category, n, m, s, view);
	}

}