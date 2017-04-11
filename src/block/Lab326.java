package block;

public class Lab326 {

	public static void main(String[] args) {
		System.out.println("i am main()");
		{
			int a=10;
			System.out.println("i am Local Block 1 in main():"+a);
			}
		{
			int a=20;
			System.out.println("i am Local Block 2 in main():"+a);
		}
		{
			String a="maruti";
			System.out.println("i am Local Block 3 in main():"+a);
		}

	}

}
