
import java.util.*;
public class MinArray
{
	public static void main(String args[])
	
	{
		int iNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store: "); 
		iNo=sc.nextInt();
		int iArr []=new int[10];
		System.out.println("Enter The Array Element:");
		
		for(int i=0;i<=iNo;i++)
		{
			iArr[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");  
		for (int i=0; i<=iNo; i++)   
		{  
			System.out.println(" "+iArr[i]);  
		}  
		
		int iMin=iArr[0];
		
		
		for(int i=0;i<iArr.length;i++)
		{
			if(iMin>iArr[i])
				iMin=iArr[i];
		}
		System.out.println("smallest  element present in the array=" +iMin);
	
	}	
	
}	