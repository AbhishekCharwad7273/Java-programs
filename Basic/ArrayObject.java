import java.util.*;


public class ArrayObject
{
	
	int iLength,iWidth,area;
	Scanner sc=new Scanner(System.in);
	
	void accept()
	{
		
		System.out.println("Enter the Length");
		iLength=sc.nextInt();
		System.out.println("Enter the Width");
		iWidth=sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Length:="+iLength);
		System.out.println("Width:="+iWidth);
		 area=(iLength*iWidth);
		System.out.println("area of rectangle="+area);
		
	}
	
	
	
	public static void main(String args[])
	{	
		//ArrayObject arr[]=new ArrayObject[3];
		/*(for(int i=0;i<3;i++)
			{
				arr[i]=new ArrayObject();
				arr[i].accept();
				arr[i].display();
			}
			*/
			ArrayObject obj1=new ArrayObject();
			obj1.accept();
			obj1.display();
			
			ArrayObject obj2=new ArrayObject();
			obj2.accept();
			obj2.display();
			
			ArrayObject obj3=new ArrayObject();
			obj3.accept();
			obj3.display();
			
			
	}
		
		
	
}