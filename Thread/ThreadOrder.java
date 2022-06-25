


class Asending extends Thread
{
	int a[]={12,41,58,2,1,12};
	int i,j;
	public void run()
	{
	try{
			for ( i=0;i<=5;i++)
			{
				for(j=0;j<=5;j++)
				{
					if(a[j]>a[j+1])
					{
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
	
				System.out.println("Asending order of Number::");
				System.out.println("\t"+a[i]);
			}
		}
		
		catch(java.lang.Exception e)
		{
			System.out.println(e);
		}
		
	}
}

	





public class ThreadOrder
{
	public static void main(String args[])
	{
			Asending obj=new Asending();
				obj.start();
	}
}