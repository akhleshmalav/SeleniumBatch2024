package package1;

public class Student {
	
	int rollno;
	int age;
	
	public void display1()
	{
		System.out.println("Welcome to all of you ");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.display1();
		obj.display2();
		obj.rollno=61045305;
		System.out.println("Roll Number = "+obj.rollno);
		obj.age=32;
		System.out.println("Age = "+obj.age);
		
	}

}
