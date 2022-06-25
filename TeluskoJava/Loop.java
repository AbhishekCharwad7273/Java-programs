public class Loop
{
	public static void main(String args[])
	{
		/*
		//int iNo=1;
		int iNo=10;
		//while(iNo<=5)
		do
		//for(iNo=0;iNo<=5;iNo++)	
		{
			System.out.println("Hello");
			iNo++;
		}while(iNo<=5);
		*/
		
		/*Nested loop
			*****
			*****
			*****
			*****
			*****
			
			print this pattern using nesting loop
	*/


		/*int i,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print(" * ");
			}
				
			System.out.print("\n");	
			
			
		}
*/
			
		/*	int i,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
				
			}
				
			System.out.print("\n");	
		}

*/
		int i,j,s;
		for(i=1;i<=4;i++)
		{
			
			for(j=1;j<=4;j++)
			{
				if(i>=2 && j>=2 && i<=3 && j<=3)
				{
					
					System.out.print(" ");
				}
				else 
				{

					System.out.print("*");	
				}	
			}
		System.out.println();	
		}




		
	}
}	