package package1;

public class Swift extends Maruti {   //Single level inheritance
	
	public void method3() {
		System.out.println("Child Class Method First");
	}
	
	public void method4() {
		System.out.println("Child Class Method Second");
	}
	
	public static void main(String[] args) {
		
		Swift ob=new Swift();
		ob.method1();
		ob.method2();
		ob.method3();
		ob.method4();
	}

}
