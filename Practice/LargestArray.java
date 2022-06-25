public class LargestArray
{
	public static void main(String args[])
	
	{
		int [] iArr={25,65,98,74,15};
		
		int iMax=iArr[0];
		
		
		for(int i=0;i<iArr.length;i++)
		{
			if(iArr[i]>iMax)
				iMax=iArr[i];
		}
		System.out.println("largest element present in the arrar=" +iMax);
	
	}	
	
}	