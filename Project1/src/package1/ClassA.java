package package1;

public class ClassA {
	
	int a; // variable creation -can store some value and value can be change 
	int b;
	int sum;
	int sum2;

	public void akhlesh()  // Method creation - can perform any action(operation)
	{
		System.out.println("Welcome in automation world");
	}
	
	public void sum(int x, int y)
	{
		
		sum=x+y;
		System.out.println("Addition of nummbers = " +sum);
	}
	
	public void sum(int x, int y, int z)
	{
		
		sum=x+y+z;
		System.out.println("Addition of nummbers = " +sum);
	}
	
	public static void main(String[] args)  // Main method
    {
		ClassA abc=new ClassA();   //object creation - one class can have multiple objects
		abc.akhlesh();

		ClassA xyz=new ClassA();
		xyz.sum(10,20);
		
		ClassA pqr=new ClassA();
		pqr.sum(10,20,30);
    }

}
