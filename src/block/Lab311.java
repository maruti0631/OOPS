package block;

public class Lab311 {

	public static void main(String[] args) {
		Hello17 h=new Hello17();
	}
}
class Hello17{
	int a=10;
	static int b=20;
	{
		int c=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}