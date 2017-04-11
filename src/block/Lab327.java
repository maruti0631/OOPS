package block;

public class Lab327 {
	int a;
	public static void main(String[] args) {
		System.out.println("i am main()");
		int a = 90;
		{
			//int a = 10; //Duplicate local variable a
			System.out.println("i am Local Block 1 in main():" + a);
		}
	}
	{
		int a = 10;
		System.out.println("i am Local Block 1 in main():" + a);
	}

}

