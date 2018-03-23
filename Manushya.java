public class Manushya
{
	public final void makeNoise()
	{
		System.out.println("Man making noise");	
	}

}
class MariMan extends Manushya
{
	public final void makeNoise()
	{
		System.out.println("MariMan making noise");	
	}
}

public class  TestManushya {


Manushya ma = new Manushya();
ma.makeNoise();
MariMan mi = new MariMan();
mi.makeNoise();

}
