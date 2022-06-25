
import java.util.*;
public class Integer
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number To be Search:");
		int toFind = sc.nextInt();
		int[] num = {1, 2, 3, 4, 5};
		
		boolean found = false;

		for(int iCnt=0;iCnt<num.length;iCnt++)
		{
			if (iCnt == toFind)
			{
				found = true;
				break;
			}
		}
    
		if(found)
			System.out.println(toFind + " is found.");
		else
			System.out.println(toFind + " is not found.");
			
	}
}