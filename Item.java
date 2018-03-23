public class Item
{	
	private String name;
	private double price;

	public Item()
	{
		System.out.println("Inside no-arg constr");
	}
	public Item(String s)
	{
		System.out.println("Inside string param constr");
		name = s;	
	}
	
	public Item(String str, double d)
	{	
		System.out.println("in Item string,double param constr!");
		//validate!!!
		name = str;
		price = d;
	}

	public void setName(String str)
	{
		//validate str
		// str should not be null
		// str should not contain only spaces!
		
		if(str==null || str.trim().equals(""))// "" " " "  " "   " "     "
		{
			System.out.println("Item must have a non-null, non-blank string value, you mutthal!");
		}
		else
			name = str;
	}
	public void setPrice(double d)
	{
		if(d<0 || d > 1000)
			System.out.println("Price must be between 0-1000!");
		else
			price = d;
		
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;	
	}
}






