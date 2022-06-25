public class FloatArray
 {  
    public static void main(String[] args)
	{  
        float sum=0;  
        float [] arr = {1.5f,2.5f,3.5f,4.5f,5.5f};
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+(arr[i]);
		}
		System.out.println("The Sum of Float Number is :"+sum);
	}
 }