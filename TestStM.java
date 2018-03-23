public class TestStM
{
	String name = "test"; // inst ref - as many copies as many obj
	static int c = 10; // static prim - single copy
	
	public static void print() // st = class scoped single copy method
	{
		System.out.println("in print() static method");
		//System.out.println("c = "+c+" name = "+name);
//can a static method access both instance and static members? NOOOOO!
// how to still access name??? only 1 way...create obj!

		TestStM obj = new TestStM();
		System.out.println("name = "+obj.name);

	}
	public void printVar() // inst m
	{
		System.out.println("in printVar() inst method");
		System.out.println("c = "+c+" name = "+name);
	}
	// can we access inst members and static members in 
	// instance method?? YES!!!
}








