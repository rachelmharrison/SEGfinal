public class ViewDeliveriesScreen extends SearchScreen
{
	String category="Product Name:";
	int n=1;
	String[][] m=new String[1][2];
	m[0][0]="Date Received";
	m[0][1]="Product Name";


	String[] s={"Sort By"};

	ViewDeliveriesScreen(View view)
	{
		super(category, n, m, s, view);
	}

}