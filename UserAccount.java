public class UserAccount
{
	String userName;
	String password;
	String email;
	Passenger passengerRole;
	Personnel employeeRole;
	Admin adminRole;

	UserAccount(String userName, String password, Passenger p, String email);
	{
		this.userName=userName;
		this.password=password;
		this.passengerRole=p;
		this.email=email;
		system.addPassenger(passengerRole);
	}

	UserAccount(String userName, String password, Personnel p, String email);
	{
		this.userName=userName;
		this.password=password;
		this.employeeRole=p;
		this.email;
		system.addEmployee(employeeRole);
	}

	UserAccount(String userName, String password, Admin a, String email);
	{
		this.userName=userName;
		this.password=password;
		this.adminRole;
		this.email=email;
		system.addAdmin(adminRole);
	}
	
	public String getUserName(){
		return userName;
	}
	public String getPassword(){
		return password;
	}
	public String getEmail(){
		return email;
	}



}
