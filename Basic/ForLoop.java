public class ForLoop
{
	public static void main(String args[])
	{
		//for (int i=0;i<=20;i+=2)

		//{
			//System.out.println(i);
		//}
		
		//int iNo=4;
		/*
		for(int i=1;i<iNo;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		*/
		
		
		int sum=0;
		for(int i=100;i<=200;i++)
		{
			if(i%7==0)
			{
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
		
		
	}
}
