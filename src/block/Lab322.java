package block;

public class Lab322 {

	public static void main(String[] args) {
System.out.println("\nMain:"+Hello322.a);
	}		
}
class Hello322{
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
	


