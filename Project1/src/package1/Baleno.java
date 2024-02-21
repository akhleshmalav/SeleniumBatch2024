package package1;

public class Baleno extends Maruti{ //Hierarchy inheritance
	
	public void method7() {
		System.out.println("Child Class Method Third");
	}
	
	public void method8() {
		System.out.println("Child Class Method Fourth");
	}
	
	public static void main(String[] args) {
		
		Baleno ob=new Baleno();
		ob.method1();
		ob.method2();
		ob.method7();
		ob.method8();
	}

}
