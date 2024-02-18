package package1;

public class Assignment2Feb4 {
	
	public void m1()
	{
		System.out.println("default constructor");
	}
	
	public void m2(int a)
	{
		System.out.println("one parameterized constructor");	
	}
	
	public void m3(int a, int b)
	{
		System.out.println("two parameterized constructor");
	}
	
	public void m4(int a, int b, int c)
	{
		System.out.println("three parameterized constructor");
	}
	
	public void m5(int a, int b, int c, int d)
	{
		this.m4(1,2,3);
		System.out.println("four parameterized constructor");
		this.m1();
		this.m3(1,2);
		this.m4(1,2,3);
	}
	public static void main(String[] args) {
		
		Assignment2Feb4 obj=new Assignment2Feb4();
		obj.m5(1,2,3,4);
		
	}

}
