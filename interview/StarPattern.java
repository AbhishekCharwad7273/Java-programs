/*15> StarPattern
	    *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
* * * * * * * * *
*/
import java.util.*;

public class StarPattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row");
		int iRow=sc.nextInt();
		
		for(int iCnt=1;iCnt<=iRow;iCnt++)
		{
			for(int iSpace=1;iSpace<=(iRow-iCnt);iSpace++)
			{
				System.out.print(" ");
			}
			
			for(int jCnt=1;jCnt<=iCnt;jCnt++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}

				
			
		