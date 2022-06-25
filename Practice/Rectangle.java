

import java.util.*;

public class Rectangle
{
	public void Calculate(int iNo1,int iNo2)
	{
		int area=iNo1*iNo2;
		int perimeter=2*(iNo1+iNo2);
		System.out.println("Area OF Square is :"+area);
		System.out.println("Perimeter OF Square is :"+perimeter);
		
	}		
	
	public static void main(String args[])
	{
		int iLength=0,iBreadth=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Length");
		iLength=sc.nextInt();
		System.out.println("Enter the Breadth");
		iBreadth=sc.nextInt();
		Rectangle obj=new Rectangle();
		obj.Calculate(iLength,iBreadth);
	}
}	
