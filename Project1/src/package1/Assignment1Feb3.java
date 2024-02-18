package package1;

//Assignment1---((((10+2)+2)-2)*2)/2)    Practice assignment

public class Assignment1Feb3 {
	
	
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
	
	public int mul(int r, int s)
	{
		int mulsresult;
		mulsresult=r*s;
		return mulsresult;
	}
	
	public void div(int t, int u)
	{
		int divsresult;
		divsresult=t/u;
		System.out.println("Arthmatic Expression Result = "+divsresult);
	}
	
	public static void main(String[] args) {
		// Assignment1---((((10+2)+2)-2)*2)/2)
		int sum;
		int sum1;
		int sub;
		int mulp;
		Assignment1Feb3 obj = new Assignment1Feb3();
		sum=obj.sum(10,2);
		sum1=obj.sum(sum,2);
		sub=obj.sub(sum1,2);
		mulp=obj.mul(sub,2);
		obj.div(mulp,2);
	}

}
