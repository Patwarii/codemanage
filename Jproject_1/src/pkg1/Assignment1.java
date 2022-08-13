package pkg1;

public class Assignment1 {
	
	public int A(int a,int b)
	{
		int A=a+b;
	    System.out.println("sum " + A);
		return A;
	}
	
	public int B(int a,int b)
	{
		int B=a-b;
	    System.out.println("sub " + B);
		return B;
	}
	
	public int C(int a,int b)
	{
		int C=a*b;
	    System.out.println("mul " + C);
		return C;
	}
	
	public int D(int a,int b)
	{
		int D=a/b;
	    System.out.println("div " + D);
		return D;
	}
	public static void main(String[] args) {
		Assignment1 ABC=new Assignment1();
		int sum1=ABC.A(10,6);
		int sub1=ABC.B(sum1, 1);
		int mul1=ABC.C(sub1, 1);
		int div1=ABC.D(mul1, 2);
		System.out.println("final "  + div1);
	}
		}
