package pkg1;

public class Assignment2 {

	public Assignment2 ()
	{
		this(1,2,3,4);
	System.out.println("default constructer");	
	}
	
	public Assignment2 (int a)
	{
		this();
	System.out.println("1 para");	
	}
	
	public Assignment2 (int a,int b)
	{
		this(1);
	System.out.println("2 para");	
	}
	
	public Assignment2 (int a,int b,int c)
	{
		this(1,2);
	System.out.println("3 para");	
	}
	
	public Assignment2 (int a,int b,int c,int d)
	{
	System.out.println("4 para");	
	}
	
	public static void main(String[] args) {
		Assignment2 callC=new Assignment2(1,2,3);
	}
}
