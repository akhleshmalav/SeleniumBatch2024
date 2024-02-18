package package1;

public class Assignment1Feb4 {
	
	public Assignment1Feb4() {
		
		this(1,2,3);
		System.out.println("default constructor");
	}
	
	public Assignment1Feb4(int a) {
		
		System.out.println("one parameterized constructor");
	}
	
	public Assignment1Feb4(int a, int b) {
		
		this(1);
		System.out.println("two parameterized constructor");
	}
	
	public Assignment1Feb4(int a, int b, int c) {
		
		System.out.println("three parameterized constructor");
	}
	
    public Assignment1Feb4(int a, int b, int c, int d) {
    	
		System.out.println("four parameterized constructor");
	}
	
	public static void main(String[] args) {
		
		Assignment1Feb4 obj=new Assignment1Feb4();
		Assignment1Feb4 obj1=new Assignment1Feb4(1,2);
		Assignment1Feb4 obj2=new Assignment1Feb4(1,2,3,4);
		
	}
	

}
