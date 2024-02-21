package package1;

public class SwiftDezire extends Swift {   //multilevel inheritance
	
	public void method5() {
		System.out.println("Sub Child Class Method First");
	}
	
	public void method6() {
		System.out.println("Sub Child Class Method Second");
	}

	public static void main(String[] args) {
		SwiftDezire ob=new SwiftDezire();
		ob.method1();
		ob.method2();
		ob.method3();
		ob.method4();
		ob.method5();
		ob.method6();
	}
}
