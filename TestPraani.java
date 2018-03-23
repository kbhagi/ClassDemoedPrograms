public class TestPraani
{
	public static void main(String[] args)
	{	
		Monkey m = new Monkey();
		m.name = "Ronny";
		Donkey d = new Donkey();
		d.name = "Jonny";
		Vet v = new Vet();
		v.name = "Shambu";
		v.treat(m);
		v.treat(d);
	}

}
