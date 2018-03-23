 class Human
{
	String name = "manushya";
	public void think()
	{
		System.out.println("human "+name+" thinking...I think. Therefore I am!");
	}
}
class Man extends Human
{
	String name = "maanav";
	public void shout()
	{
		System.out.println("man "+name+" SHOUTING!!!");	
	}
	public void think()
	{
		System.out.println("Man thinking....think...thunk...thought! "+name);	
	}
}
class TestMan
{
	public static void main(String[] args)
	{
		Man m = new Man();
		Human h = m;
		System.out.println("accessing name using m "+m.name);
		System.out.println("accessing name using h "+h.name);
		
		h.think();
		m.shout();
	}
}




