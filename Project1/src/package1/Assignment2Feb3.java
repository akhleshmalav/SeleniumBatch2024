package package1;

//Assignment2--------  ((((10/2)-2)+2)-2)/2)


public class Assignment2Feb3 {
	
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
	
	public int div(int t, int u)
	{
		int divsresult;
		divsresult=t/u;
		return divsresult;
		
	}
	
	public static void main(String[] args) {
		//Assignment2--------  ((((10/2)-2)+2)-2)/2)
		int sum;
		int div;
		int sub;
		Assignment2Feb3 obj = new Assignment2Feb3();
		div=obj.div(10,2);
		sub=obj.sub(div,2);
		sum=obj.sum(sub,2);
		sub=obj.sub(sum,2);
		div=obj.div(sub,2);
		System.out.println("Arthmatic Expression Result = "+div);
	}

}
