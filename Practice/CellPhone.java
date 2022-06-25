public class CellPhone
{
	
		public void Ringing()
		{
			System.out.println("CellPhone is Ringing");
			
		}

		public void Vibrating()
		{
			System.out.println("The Phone is vibrating");
		}

	
	
	public static void main(String args[])
	{	
		CellPhone obj=new CellPhone();
		obj.Ringing();
		obj.Vibrating();
	}
}	
		