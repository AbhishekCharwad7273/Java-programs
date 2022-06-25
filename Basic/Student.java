import java.util.Scanner;

public class Student
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first subject marks");
		int iNo1=sc.nextInt();
		System.out.println("enter the second subject marks");
		int iNo2=sc.nextInt();
		System.out.println("enter the third subject marks");
		int iNo3=sc.nextInt();
		float avg=(iNo1+iNo2+iNo3)/3.0f;	
		if(avg >=40 && iNo1>=33 && iNo2>=33 && iNo3>=33 )
		{
			System.out.println("pass");
		}
			
		else
		{
			System.out.println("fail");
		}
	}
}	