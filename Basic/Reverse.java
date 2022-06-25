public class Reverse
{
	public static void main(String args[])
	{
		int no=786;
		int Rev=0;
		while(no>0)
		{
			int R=no%10;
			Rev=Rev*10+R;
			no=no/10;
		}
		System.out.println("The reverse number is :"+Rev);
	}
}
	