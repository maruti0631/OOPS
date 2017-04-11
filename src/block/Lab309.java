package block;

public class Lab309 {

	public static void main(String[] args) {
	System.out.println("Main:"+Hello14.a);
	}
}
class Hello14{
	static int a;
	 int b;
	static{
		a=10;
		//b=20;    //Cannot make a static reference to the non-static field b
		System.out.println("Static Block");
	}
}