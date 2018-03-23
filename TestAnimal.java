public class TestAnimal
{
	public static void main(String[] args)
	{
	/*	Animal a = new Animal();
		a.name = "praani";
		a.eat(); // A
		a.sleep(); // A
	*/
	/*
		Snake s = new Snake();
		s.name = "nagin";
		s.eat(); // A 
		s.sleep(); // A
		s.hiss(); // S
	*/
	/*
		MiniSnake m = new MiniSnake();
		m.name = "chotu";
		m.sing(); // MS
		m.hiss(); //  S
		m.eat(); // A
		m.sleep(); // A
		
	*/
	/*
		MiniSnake s = new MiniSnake();
		s.eat(); // A
		s.sleep(); // ? S
		s.hiss(); // S
		s.sing(); // MS
	*/
	
	Animal a = new Snake();
	//parent ref -> child obj??? YES!!!
	//MiniSnake m = new Animal(); // NOT POSSIBLE
	//child ref -> parent obj !! NONO!

	a.eat();  // A
	a.sleep(); // S!!!!!!!! overridden impl picked!!!
//	a.hiss();
	
	}

}






