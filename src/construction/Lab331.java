package construction;

public class Lab331 {

	public static void main(String[] args) {
		//Student331 stu = new Student331();	//The constructor Student331() is undefined
		Student331 stu = new Student331(5,"klwjldq");
		stu.sid = 99;
		stu.sname = "Srinivas";
		stu.show();
	}
}

class Student331 {
	int sid;
	String sname;

	Student331(int id, String sn) {
		System.out.println("Student Default Constructor");
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}

}
