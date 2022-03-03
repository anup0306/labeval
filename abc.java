package recursion;

public class abc {
	void fun(int n)
	{
		if(n>0)
		{
			fun(--n);
			System.out.println(n);
			fun(--n);
		}
	}
	
	void mnp(int n)
	{
		if(n>0)
		{
			mnp(n/3);
			System.out.println(n);
		}
	}
	
	int reverseDigit(int n)
	{
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc q =new abc ();
		//q.fun(3);
		//q.mnp(27);
		int pq=q.reverseDigit(123);
		System.out.println(pq);
	}

}
