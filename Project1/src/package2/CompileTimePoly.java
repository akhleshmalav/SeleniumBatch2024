package package2;

public class CompileTimePoly {
	
	public void sum(int a, int b)   // differ input paramter with count differ here
	{
		int c;
		c=a+b;
		System.out.println("Addition of number " +c); 
	}
	
	public void sum(int a, int b, int c)
	{
		int d;
		d=a+b+c;
		System.out.println("Addition of number " +d); 
	}

	public static void main(String[] args)
	{
		CompileTimePoly ob=new CompileTimePoly();
		ob.sum(1,2);
		ob.sum(1,2,3);
		System.out.println("This is coomile time polymorhism here");
	}
}
