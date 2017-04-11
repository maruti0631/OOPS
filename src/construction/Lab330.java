package construction;

public class Lab330 {

	public static void main(String[] args) {
		Student330 stu=new Student330();
		stu.sid=99; stu.sname="Srinivas";
		stu.show();
        }
		}
		class Student330{
			int sid ;
			String sname;
			Student330(){
				System.out.println("Student Default Constructor");
			}
			void show(){
				System.out.println(sid+"\t"+sname);
	}

}
