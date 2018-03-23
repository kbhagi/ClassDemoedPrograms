public class TestItem
{
	public static void main(String[] args)
	{
		Item i2 = new Item();
		Item i3 = new Item("Shirt");
		Item i1 = new Item("Cup",200);
		
		//1. Force user to pass minimum state values during object creation!
		//2. Pass a convenience to user to set the state during object creation!
		//3 Use of Constructor -> to initialize state when object is being constructed!
		
		System.out.println("name of i1 = "+i1.getName()+" price = " + i1.getPrice());
		i1.setName("Topi");
		i1.setPrice(100);
		System.out.println("name of i1 = "+i1.getName()+" price = " + i1.getPrice());
		
	}

}
