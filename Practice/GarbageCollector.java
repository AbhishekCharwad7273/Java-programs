

public class GarbageCollector
{
	public void finalize()
	{
		
	}
	public static void main(String args[])
	{
		String str="Abhi";
		str=null;
		System.gc();//garbage collector called
	}
}

	