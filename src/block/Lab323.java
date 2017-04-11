package block;

public class Lab323 {

	public static void main(String[] args) {
		new Hello323();
		System.out.println("\n**Hello323 Guys");
	}		
}
class Hello323{
	static int a;
	{
		System.out.println("\n i am Local Block in IIB");
		{
			System.out.println("i am local Block in IIB");
		}
	}

static{
	System.out.println("\n i am SIB");
	{
		System.out.println("i am Local Block in SIB");
	}
}
}
