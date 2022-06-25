//12>pyramid pattern
import java.util.*;

class PyramidPattern
 {
	public static void main(String[] args)
	{
		System.out.println("enter the rows");
		Scanner sc=new Scanner(System.in);
		
		int iRow=sc.nextInt();
		
		for(int i=1;i<=iRow;i++)
		{
			for(int space=1;space<=(iRow-i);space++)
			{
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+i);
			}
		
				System.out.println();		
		}		
		
		
	}
 }
 