package pkg1;

public class Student {
	
	int roll_No;
	int age;
	public void Aditya()
	{
		System.out.println("roll number of the student");
	}
	
	public void Adi()
	{
		System.out.println("age  of the student");
	}
	public static void main(String[] args)
	{
	Student abc=new Student();
	abc.Aditya();
	abc.roll_No=10;
	System.out.println(abc.roll_No);
	abc.Adi();
	abc.age=11;
	System.out.println(abc.age);
}
}
