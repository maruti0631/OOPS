package block;

public class Lab315 {

	public static void main(String[] args) {
		System.out.println("Main:"+Hello21.b);
	}
}
		
		class Hello21{
			
			static int b;
			static{
				final  int c=12;
				
				System.out.println(b);
				System.out.println(c);
			}

	}


