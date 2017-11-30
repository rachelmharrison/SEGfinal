public class MainClass //don't touch this one
{
	public static void main(String args[])
	{
		MainClass system = new MainClass();
	}

	UserAccount[] accounts=new UserAccount[100];
//	Passenger[] passengers=new Passenger[100];
//	Flight[] flights=new Flight[100];
//	Luggage[] luggage=new Luggage[100];
//	Event[] events=new Event[100];
//	WaitLine[] waitLines=new WaitLines[100];
//	Delivery[] deliveries=new Delivery[100];
//	Personnel[] employees=new Personnel[100];
//	Admin[] admins=new Admin[100];
	UserAccount currentUser;

	MainClass()
	{
		View view = new View(this);
	}

//	public void addPassenger(Passenger p)
	{
		//implement this and all other adder methods
	}

	public boolean checkForUsername(String s)
	{
		int i=0;
		while(accounts[i]!=null)
		{
			if(accounts[i].getUsername()==s)
				return true;
		}
		return false;
	}
		

	public boolean checkForEmail(String s)
	{
		int i=0;
		while(accounts[i]!=null)
		{
			if(accounts[i].getEmail()==s)
				return true;
		}
		return false;
	}

	public void createAccount(String u, String p, String n, String r, String d, char g, String e)
	{

	}

	public boolean validateUser(String u, String p)
	{
		int i=0;
		while(accounts[i]!=null)
		{
			if(accounts[i].getUsername()==s && accounts[i].getPassword()==p)
			{
				currentUser=accounts[i];
				return true;
			}
		}
		return false;
	}
}