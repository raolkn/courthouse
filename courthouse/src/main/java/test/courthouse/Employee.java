package test.courthouse;


public class Employee {
	private int ID;
	private String Name;
	private String Email;
	private String Password;
	private String Active;
	private String Gender;
	
	public Employee()
	{
	}
	
	public Employee(int id, String name)
	{
		ID = id;
		Name = name;
	}
	
	public int getID() { return ID; }
	public void setID(int id) { ID = id; }
	
	public String getName() { return Name; }
	public void setName(String name) { Name = name; }
	
	public String getEmail() { return Email; }
	public void setEmail(String email) { Email = email; }
	
	public String getPassword() { return Password; }
	public void setPassword(String password) { Password = password; }
	
	public String getActive() { return Active; }
	public void setActive(String active) { Active = active; }
	
	public String getGender() { return Gender; }
	public void setGender(String gender) { Gender = gender; }
}
