
public class Operator
{
	public static void main(String args[])
	{
		//Airthmatic Operator (+,-,*,/,%)
		int iNo1=10,iNo2=7;
		int iAdd=iNo1+iNo2;
		System.out.println("Addition is : "+iAdd);
		double iDiv=iNo1/iNo2;
		System.out.println("Division is : "+iDiv);
		int iMul=iNo1*iNo2;
		System.out.println("multiplication is : "+iMul);
		int iSub=iNo1-iNo2;
		System.out.println("subtraction is  is :"+iSub);
		double  iMod=iNo1%iNo2;
		System.out.println("Modula  is :"+iMod);
		//++iNo1;
		iNo2=iNo1++;
		System.out.println(iNo2);
		//ternery operator
		iNo2=iNo1>20?1:2;
		System.out.println(iNo2);
	}
}	
		