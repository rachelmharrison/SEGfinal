public class UserAccount
{
	String userName;
	String password;
	String email;
	Passenger passengerRole;
	Personnel employeeRole;
	Admin adminRole;

	UserAccount(String userName, String password, Passenger p, String email)
	{
		this.userName=userName;
		this.password=password;
		this.passengerRole=p;
		this.email=email;
		
	}

	UserAccount(String userName, String password, Personnel p, String email)
	{
		this.userName=userName;
		this.password=password;
		this.employeeRole=p;
		this.email=email;

	}

	UserAccount(String userName, String password, Admin a, String email)
	{
		this.userName=userName;
		this.password=password;
		this.adminRole=a;
		this.email=email;

	}
	
	public String getUsername(){
		return userName;
	}
	public String getPassword(){
		return password;
	}
	public String getEmail(){
		return email;
	}
	public void setUsername(String name){
		userName=name;
	}
	public void setPassword(String pass){
		password=pass;
	}
	public void setEmail(String email){
		email=email;
	}

	public String getRole()
	{
		if(adminRole!=null)
			return "admin";
		if(passengerRole!=null)
			return "passenger";
		if(employeeRole!=null)
			return "personnel";
		return "";
	}

	public String getName()
	{
		if(adminRole!=null)
			return adminRole.getName();
		if(passengerRole!=null)
			return passengerRole.getName();
		if(employeeRole!=null)
			return employeeRole.getName();
		return "";
	}


}
