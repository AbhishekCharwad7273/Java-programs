import java.util.Scanner;
public class Methods
{

	 int Divide(int iNo1, int iNo2)
	{
		int iAns = 0;
			if(iNo2>iNo1)
				{
						return -1;
				}
		iAns = iNo1 / iNo2;
		return iAns;
	}


public static void main(String args[])

{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	int iValue1=sc.nextInt();
	System.out.println("enter the second number");
	int  iValue2=sc.nextInt();
	
	Methods obj=new Methods();
	int iRet = obj.Divide(iValue1, iValue2);
	System.out.println(iRet);
}
}