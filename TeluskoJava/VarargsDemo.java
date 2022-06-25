


class calc
{
	public int add(int ... n)//it will doesnt matter how many element passed it will passed like array
	{
		int sum=0;
		for(int i :n)
		{
			sum=sum+i;
		}
		return sum; 
	}

}
	




public class VarargsDemo
{
	public static void main(String args[])
	{
			calc obj=new calc();
			System.out.println(obj.add(14,54,4,5,4));
	}
}
	