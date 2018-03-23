public class SuperHero extends Hero
{
	String power;
	public SuperHero(String n,String p)
	{
		super(n);	
		System.out.println("in SuperHero`s param constr");
		power = p;
	}
	
	public void fight()
	{
		super.fight();
		System.out.println("Superhero fighting using "+power);
	}
}





