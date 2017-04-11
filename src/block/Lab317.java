package block;

public class Lab317 {

	public static void main(String[] args) {
		
		System.out.println("Main:"+Hello22.a);
	
	}

}
class Hello22{
	static int a=10;
	static{
		System.out.println("S.Block 1:"+a);
	}
	static{
		System.out.println("S.Block 2:"+a);

	}

}
