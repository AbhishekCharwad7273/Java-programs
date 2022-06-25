/*16>inverted pattern
			
*****************
 ***************
  *************
   ***********
    *********
     *******
      *****
       ***
        *
*/


import java.util.*;

class InvertedPattern
 {
	public static void main(String[] args)
	{
		System.out.println("enter the rows");
		Scanner sc=new Scanner(System.in);
		
		int iRow=sc.nextInt();
		
		for(int i=iRow;i>=1;i--)
		{
			for(int space=1;space<=(iRow-i);space++)
			{
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
		
				System.out.println();		
		}		
		
		
	}
 }
 