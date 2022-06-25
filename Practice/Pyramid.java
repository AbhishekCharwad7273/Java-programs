
import java.util.*;

public class Pyramid
{
	public void display(int iNo)
	
	{
		int i;
		for(i=1;i<=iNo;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter The Number ");
		int iValue = Sc.nextInt();
		Pyramid obj=new Pyramid();
		obj.display(iValue);
		
			
	}
}