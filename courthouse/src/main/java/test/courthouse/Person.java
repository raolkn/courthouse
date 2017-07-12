package test.courthouse;

public class Person {
	private int id;
	private String name;
	
	public Person()
	{
	}
	
	public Person(int ID, String Name)
	{
		id = ID;
		name = Name;
	}
	
	public int getID() { return id; }
	public void setID(int ID) { id = ID; }
	
	public String getName() { return name; }
	public void setName(String Name) { name = Name; }
	
	
	public String sayHello()
	{
		return "Hello .." + name;
	}
}
