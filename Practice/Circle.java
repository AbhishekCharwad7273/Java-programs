

import java.util.*;

public class Circle
{
	public void Calculate(int iNo)
	{
		final float pi=3.14f;
		float area=pi*(iNo*iNo);
		float perimeter=2*(pi*iNo);
		System.out.println("Area OF Square is :"+area);
		System.out.println("Perimeter OF Square is :"+perimeter);
		
	}		
	
	public static void main(String args[])
	{
		int iRedius;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Redius");
		iRedius=sc.nextInt();
		Circle obj=new Circle();
		obj.Calculate(iRedius);
	}
}	
