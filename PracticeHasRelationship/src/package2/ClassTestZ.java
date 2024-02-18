package package2;

import package1.ClassTestX;

public class ClassTestZ {
	
	public static void main(String[] args) {
		
		ClassTestX ob=new ClassTestX();     //Has relationship into different package
		ob.m1();
		ob.m2();
		
	}

}
