
import java.util.*;
public class Cylinder
{
	
	//float iRedius;
	//float iHeight;
	float pi=3.14f;
	public float getRadius(float iRedius)
	{
		return iRedius;
	}

	public void setRadius(float iRedius)
	{
	//	this.iRedius;
		System.out.println("the radius of a Cylinder is :"+iRedius);
	}	
	public float getHeight(float iHeight)
	{
		return iHeight;
	}

	public void setHeight(float iHeight)
	{
		//this.iHeight;
		System.out.println("the Height of a Cylinder is :"+iHeight);
	}
	
	public void AreaCylinder(float iRedius,float iHeight)
	{
		
		float Area=2*(pi*iRedius*iHeight)+2*(pi*iRedius*iRedius);
		System.out.println("Area of a Cylinder is :"+Area);
		
	}

	public void Volume(float iRedius,float iHeight)
	{
		float Vol=(pi*iRedius*iRedius*iHeight);
		System.out.println("Volume of a Cylinder is :"+Vol);
	}		
			
	
	public static void main(String args[])
	{
	float iValue1=0,iValue2=0;	
	System.out.println("Enter The Redius :");
	Scanner sc=new Scanner(System.in);
	iValue1=sc.nextFloat();
	System.out.println("Enter The Height :");

	iValue2=sc.nextFloat();
	Cylinder obj=new Cylinder();
	obj.getRadius(iValue1);
	obj.setRadius(iValue1);	
	obj.setHeight(iValue2);
	obj.getHeight(iValue2);
	obj.AreaCylinder(iValue1,iValue2);	
	obj.Volume(iValue1,iValue2);
	}
}
	