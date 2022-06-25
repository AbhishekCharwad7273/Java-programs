public class TwoDimentional
{
	public static void main(String args[])
	{
		
		int arr[][]={
						{12,25,45,14},
						{4,54,98,47},//------->Diff size of array called Jagged Array
						{85,41,65,25,58,44}	
			
			
					};

		for(int i=0;i<arr.length;i++)//---->Row
		{
			for(int j=0;j<arr[i].length;j++)//----->Coloumn
			{
				

				System.out.print(" " + arr[i][j]);
			}	
			
			System.out.println();
		}
		
	}	
}	
