import java.util.Scanner;


public class Switchcase
{
	public static void main(String args[])
	{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		switch(age)
		{
			case 18:
			System.out.println("you are adult");
			break;
			case 25:
			System.out.println("you have a job");
			break;
			case 60:
			System.out.println("you are retired");
			break;
			default:
			System.out.println("enjoy your life");
		}	
	}
}	
