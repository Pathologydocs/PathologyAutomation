package entities;

public enum Admin {
	
	Facility("Manage Facility");
	
	
	private String type;
	
	Admin(String type)
	{
		this.type=type;
	}
	
	public String toBaseString()
	{
		return this.type;
	}

}
