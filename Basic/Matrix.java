
public class Matrix
{
	public static void main(String args[])
	{
	
	int [][] iMat1={{2,5,6},{7,8,10}};
	int [][] iMat2={{10,12,13},{15,18,20}};
	int [][] iResult={{0,0,0},{0,0,0}};
	
	for(int i=0;i<iMat1.length;i++)
	{
		for (int j=0;j<iMat1[i].length;j++)
		{
			System.out.format("setting the value for i=%d j=%d\n",i,j);
			iResult[i][j]=iMat1[i][j] + iMat2[i][j];
		}
			
		
	}	
	
		for(int i=0;i<iMat1.length;i++)
	{
		for (int j=0;j<iMat1[i].length;j++)
		{
			System.out.print(iResult[i][j]+ "" );
			iResult[i][j]=iMat1[i][j] + iMat2[i][j];
		}
			
		System.out.println("");
	}		
	
	
	
	}
}	