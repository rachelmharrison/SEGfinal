public class Service
{
	Schedule schedule;
	String type;
	String name;
	
	public Service(String name, String type){
		this.type=type;
		this.name=name;
	}

	public String getName()
	{
		return name;
	}

	public String getType()
	{
		return type;
	}
}
