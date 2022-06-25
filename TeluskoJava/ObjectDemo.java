
 class Calc
{
	int iNO1;
	int iNO2;
	int iRsult;
	
	public void perform()
	{
		iRsult=iNO1+iNO2;
	}
	
}
	


public class ObjectDemo
{
		public static void main(String args[])
		{
			Calc obj=new Calc();
			obj.iNO1=10;
			obj.iNO2=20;
			obj.perform();
			System.out.println(obj.iRsult);
		}
}		