package block;

public class Lab307 {

	public static void main(String[] args) {
		Hello12 h = null;
		System.out.println("Ref created");
	h=new Hello12();
	}

}
class Hello12{
	
	{
		System.out.println("instance Block");
	}
	static{
		System.out.println("static Block");

	}

}
