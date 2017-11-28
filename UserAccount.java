public class UserAccount
{
	String userName;
	String password;
	Passenger passengerRole;
	Personnel employeeRole;
	Admin adminRole;

	UserAccount(String userName, String password, Passenger p);
	{
		this.userName=userName;
		this.password=password;
		this.passengerRole=p;
		system.addPassenger(passengerRole);
	}

	UserAccount(String userName, String password, Personnel p);
	{
		this.userName=userName;
		this.password=password;
		this.employeeRole=p;
		system.addEmployee(employeeRole);
	}

	UserAccount(String userName, String password, Admin a);
	{
		this.userName=userName;
		this.password=password;
		this.adminRole;
		system.addAdmin(adminRole);
	}



}