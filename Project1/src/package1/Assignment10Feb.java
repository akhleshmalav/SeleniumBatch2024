package package1;

public class Assignment10Feb {
	
	int a=10;
	
	public void m1() {
		int b=100;
		System.out.println("Local variable value = "+b); // local variable declared into same method
		System.out.println("Existing global variable value = "+a); // existing global variable value
		a=20;
		System.out.println("Updated global variable value = "+a); // Updated global variable value
		
	
	}
	public void m2() {
		System.out.println("Existing global variable value = "+a); // existing global variable value
		
		a=30;
		System.out.println("Updated global variable value ith other method = "+a);
		//System.out.println("Print global variable value = "+b);
		int c=100;
		System.out.println("Local variable value = "+c); // local variable declared into same method
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment10Feb ob=new Assignment10Feb();
		ob.m1();
		ob.m2();
		

	}

}
