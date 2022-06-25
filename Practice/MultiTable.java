
import java.util.*;

public class MultiTable
{
	public void display(int iNo)
	
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.format("%d x %d =%d \n" ,iNo,i,(iNo*i));
		}
	}


	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the value To Print Multi Table: ");
		int iValue = Sc.nextInt();
		MultiTable obj=new MultiTable();
		obj.display(iValue);
		
			
	}
}