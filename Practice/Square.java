

import java.util.*;

public class Square
{
	public void Calculate(int iNo)
	{
		int area=iNo*iNo;
		int perimeter=4*(iNo);
		System.out.println("Area OF Square is :"+area);
		System.out.println("Perimeter OF Square is :"+perimeter);
		
	}		
	
	public static void main(String args[])
	{
		int iValue=0;
		System.out.println("Enter the Number");
		Scanner sc =new Scanner(System.in);
		iValue=sc.nextInt();
		Square obj=new Square();
		obj.Calculate(iValue);
	}
}	
