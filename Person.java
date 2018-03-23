public class Person
{	
	int age;
	String name;
	public Person()
	{
		System.out.println("in Persons no-arg constr");
		age = 10;
		name = "Ron";
	}
	public Person(String name)
	{
		this.name = name;
		System.out.println("in Person`s string param constr");
	}
	public Person(String name, int a)
	{
		this(name);
		System.out.println("in Person`s string,int param constr");
		age = a;
	}


}
