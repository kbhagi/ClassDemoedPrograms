class T
{
	static int count; // single copy class scoped var!
	public T()
	{
		count++;	
	}
}
public class TestStatic
{
	public static void main(String[] args)
	{
		System.out.println("count = "+T.count);
		T t1 = new T();
		T t2 = new T();
		T t3 = new T();
		System.out.println("t1 count = "+t1.count);
		System.out.println("t2 count = "+t2.count);
		System.out.println("t3 count = "+t3.count);
		T t4 = null;
		System.out.println("t4 count = "+t4.count);
	
		//TestStM obj = new TestStM();
		//obj.printVar();
		
		TestStM.print();
	}

}




