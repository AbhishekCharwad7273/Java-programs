/*13>Pattern
		 1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
*/
import java.util.*;

class Pattern
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
				System.out.print(" "+j);
			}
		
				System.out.println();		
		}		
		
		
	}
 }
 