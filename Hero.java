public class Hero
{
	String name;
	
	public Hero(String n)
	{
		name = n;
		System.out.println("in Hero`s param constr "+n);
	}
	
	public void fight()
	{
		System.out.println("Hero "+name+" fighting...dishum..dishum");	
	}
}
