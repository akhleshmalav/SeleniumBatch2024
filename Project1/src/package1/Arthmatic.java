package package1;

public class Arthmatic {
//	(10+2)(10-2)  Practice assignment
	
	public int sum(int a, int b)
	{
		int sumresult;
		sumresult=a+b;
		return sumresult;
	}
	
	public int sub(int p, int q)
	{
		int subresult;
		subresult=p-q;
		return subresult;
	}
	
	public void mul(int r, int s)
	{
		int mulsresult;
		mulsresult=r*s;
		System.out.println("Aithmatic Expression Result = "+mulsresult);
	}
	

	public static void main(String[] args) {
		// (10+2)(10-2)  Practice assignment
		int sm;
		int sb;
		Arthmatic obj = new Arthmatic();
		sm=obj.sum(10,2);
		sb=obj.sub(10,2);
		obj.mul(sm,sb);
	
	}

}
