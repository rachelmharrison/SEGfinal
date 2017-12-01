public class ViewDeliveriesScreen extends SearchScreen
{
	String category="Product Name:";
	int n=1;
	String[][] m={{"Date Recived", "Product Name"}};


	String[] s={"Sort By"};

	ViewDeliveriesScreen(View view)
	{
		super("Product Name:", 1, new String[][]{{"Date Recived", "Product Name"}}, new String[]{"Sort By"}, view);
	}

}