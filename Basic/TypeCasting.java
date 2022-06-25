public class TypeCasting
{
	
	public static void main(String args[])
	{
		
		boolean B=true;
		System.out.println("B= "+B);
		
		byte b=2;
		System.out.println("B= "+b);
		
		Short S=100;
		System.out.println("S= "+S);
		
		char C='A';
		System.out.println("C= "+C);
		
		int I=1244;
		System.out.println("I= "+I);

		String St="Hii";
		System.out.println("St= "+St);
		
		//convert boolean to byte
		b=(byte)(B?1:0);
		System.out.println("Value of b after Conversion :"+b);
		
			
		//convert boolean to Short
		S=(short)(B?1:0);
		System.out.println("Value of S after Conversion :"+S);
		
		//convert boolean to integer
		I=(int)(B?1:0);
		System.out.println("Value of b after Conversion :"+I);
		
		//convert integer to byte
		b=(byte)(I?1:0);//error will given integer cannot convert into byte
		System.out.println("Value of b after Conversion :"+b);
		
	}
}