import java.util.*;

public class Switch
{
	public static void main(String args[])
	{
		int marks;
		System.out.println("Enter the marks");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		
		switch(marks)
		{
			case 10:
			System.out.println("Superb....");
			break;
			
			case 8:
			System.out.println("Excellent....");
			break;
			
			case 7:
			System.out.println("Very Good....");
			break;
			
			case 6:
			System.out.println("Good....");
			break;
			
			case 5:
			System.out.println("Work Hard....");
			break;
			
			case 4:
			System.out.println("Poor....");
			break;
			
			default:
			System.out.println("Not Appeared Exam....");
		}
	}
}
		