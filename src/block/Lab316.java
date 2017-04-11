package block;

public class Lab316 {

	public static void main(String[] args) {
		Hello211 h = new Hello211();
		System.out.println("Main:"+h.a);
	
	}

}
class Hello211{
	int a=10;
	{
		System.out.println("i.Block1:"+a);
	}
	{
		System.out.println("i.Block2:"+a);
	}

}
