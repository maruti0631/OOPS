package block;

public class Lab308 {

	public static void main(String[] args) {
		Hello13 h = new Hello13();
		new Hello13();
		
	}

}

class Hello13 {

	{
		System.out.println("instance Block");
	}

	static {
		System.out.println("static Block");
	}

}
