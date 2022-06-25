
import java.util.Scanner;

public class MultiTable
{
	public static void Mult(int iNo)
	{
		for (int i=1;i<=10;i++)
		{
			System.out.format("%d x %d =%d \n" ,iNo,i,(iNo*i));

		}
	}		

public static void main(String args[])

{
	Scanner sObj=new Scanner (System.in);
	System.out.println("enter the number to print table");
	int iValue=sObj.nextInt();
	//MultiTable Mobj=new MultiTable();
	//int iRet=Mobj.Mult(iValue);
	Mult(iValue);
}
}	