package Recursion;

class C{
void m3(int x){
	System.out.println("m3 Begins:"+x);
	System.out.println("m3 ends:"+x);	
}
}
	
class B{
void m2(int x){
	System.out.println("m2 Begins:"+x);
	new C().m3(x+10);
	System.out.println("m2 ends:"+x);
}
}
class A {
void m1(int x){
	System.out.println("m1 Begins:"+x);
	new B().m2(x+10);
	System.out.println("m1 ends:"+x);
}
}
class Lab393 {
	public static void main(String[] args) {
int x=10;
System.out.println("main Begins:"+x);
	new A().m1(x+10);
	System.out.println("main end:"+x);
	}
}
