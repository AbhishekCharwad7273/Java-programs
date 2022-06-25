import java.util.Scanner;

public class Day
{
	public static void main(String args[])
	{
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	int iNo=sc.nextInt();
	
	switch(iNo)
	{
		case 1:
			System.out.println("its monday");
			break;
		case 2:
			System.out.println("its Tuesday");
			break;
		case 3:
			System.out.println("its Wednesday");
			break;	
		case 4:
			System.out.println("its Thirsday");
			break;
		case 5:
			System.out.println("its Friday");
			break;
		case 6:
			System.out.println("its Saturday");
			break;			
		default:
			System.out.println("its Sunday");
	}
	}
}	