package block;

public class Lab306 {

	public static void main(String[] args) {
		Hello1 h = null;
		System.out.println("Ref created");
	}

}
class Hello1{
	static int a=10;
	{
		System.out.println("instance Block");
	}
	static{
		System.out.println("static Block");
	}
}