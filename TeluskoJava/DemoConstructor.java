
class Calculator
{
	int iNo1=4;
	double iNo2=6;
	int iResult;
	
	//public Calculator()//Default Constructor
	//{
		//iResult=iNo1*iNo2;
	
//	System.out.println("Multiplication is"+iResult);
	//}
	
	public Calculator(int n)
	{
		iNo1=n;
	}
	public Calculator(int n,double d)//parameterized Constructor
	{
		iNo1=n;
		iNo2=d;
	}
	
}	
	
	
	
	
	
public class DemoConstructor

{
	public static void main(String args[])
	{
			//Calculator obj=new Calculator(8);
			Calculator obj=new Calculator(10,12.5);
		
			System.out.println(obj.iNo1);
			System.out.println(obj.iNo2);
	}
	
}	