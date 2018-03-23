public class Vet
{
	String name;
	public void treat(Praani p)
	{
		System.out.println("Vet "+name+" going to treat praani "+p.name);
		p.dance();
		if(p instanceof Monkey)
		{
			Monkey m = (Monkey) p;
			m.sing();
			
		}
	}

}
