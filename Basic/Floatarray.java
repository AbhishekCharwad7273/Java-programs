

public class Floatarray
{
	public static void main(String args[])
	{
		
		float [] marks={21.12f,36.45f,54.20f,85.10f,98.50f};
		float sum=0;
		for(float element:marks)
		{
			 sum=sum+element;
		}
			System.out.println("sum is " + sum/marks.length);
	}
}	
		