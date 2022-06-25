import java.util.*;

public class Marks
{
	public static void main(String args[])
	{
		int iSub1=0,iSub2=0,iSub3=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Marks Of Subject 1");
		iSub1=sc.nextInt();
		System.out.println("Enter The Marks Of Subject 2");
		iSub2=sc.nextInt();
		System.out.println("Enter The Marks Of Subject 3");
		iSub3=sc.nextInt();
		float Avg=(iSub1+iSub2+iSub3)/3;
		
		if(Avg>40 && iSub1>33 && iSub2>33 && iSub3>33)
		{

			System.out.println("Student Will PAssed");
			
		}

		else
				
		{
			System.out.println("Student Will failed");
		}
	}
}
					
				