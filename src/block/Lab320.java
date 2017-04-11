package block;

public class Lab320 {

	public static void main(String[] args) {
		Hello320 h = new Hello320();
		//System.out.println("Main:"+h.a); //  a cannot be resolved or is not a field
	}

}
class Hello320{
	
	{
		int a=10;
		System.out.println("i.Block1:"+a);
	}
	
	{
	}

}
