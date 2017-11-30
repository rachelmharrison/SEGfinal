public class ViewLuggageScreen extends SearchScreen
{
	String category="Flight Number:";
	int n=1;
	String[][] m=new String[1][2];
	m[0][0]="Yes";
	m[0][1]="No";


	String[] s={"Is Lost"};

	ViewLuggageScreen(View view)
	{
		super(category, n, m, s, view);
	}

}