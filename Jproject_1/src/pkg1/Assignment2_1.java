package pkg1;

public class Assignment2_1 {

	
	public void m1()
	{
		System.out.println("default mthd");
		this.m1(1,2,3,4);
	}
	
	public void m1(int a)
	{
		System.out.println("1 para mthd");
		this.m1(1,2);
	}
	public void m1(int a,int b)
	{
		System.out.println("2 para mthd");
	}
	
	public void m1(int a,int b,int c)
	{
		System.out.println("3 para mthd");
		this.m1();
	}
	
	public void m1(int a,int b,int c,int d)
	{
		System.out.println("4 para mthd");
		this.m1(1);
	}
	
	public static void main(String[] args) {
		Assignment2_1 callM=new Assignment2_1();
				callM.m1(1,2,3);
	}
}
