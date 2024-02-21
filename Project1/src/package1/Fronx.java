package package1;

public class Fronx extends Maruti {  //Hierarchy inheritance

	public void method9() {
		System.out.println("Child Class Method Fifth");
	}
	
	public void method10() {
		System.out.println("Child Class Method Sixth");
	}
	
	public static void main(String[] args) {
		
		Fronx ob=new Fronx();
		ob.method1();
		ob.method2();
		ob.method9();
		ob.method10();
		
	}
}
