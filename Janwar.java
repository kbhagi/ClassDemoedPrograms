public abstract class Janwar
{
	String name;
	
	public Janwar()
	{
		System.out.println("in Janwars no-arg constr");	
	}
	
	public abstract void eat();
	
	public void sleep()
	{
		System.out.println("janwar "+name+" sleeping...zzzz");
	}
	
}
