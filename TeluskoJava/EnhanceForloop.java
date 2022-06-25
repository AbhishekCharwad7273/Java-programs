
public class EnhanceForloop
{
	public static void main(String args[])
	
	{
		//int arr[]={1,2,3,4}
		int arr[][]={
			
					{14,54,21,15},
					{25,48,65},
					{98,74,65,74}
					
				};

				
		
		//for (int K:arr)---->1D Array
		
		for(int k[] :arr)
			
		{
			
			for(int l:k)
				
				{
					
					System.out.print(" "+l);
				}
			System.out.println();	
		}
	}
}	