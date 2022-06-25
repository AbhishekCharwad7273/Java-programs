
import java.util.*;
public class Banking

{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount ");
		float Amt=sc.nextFloat();
		System.out.println("How much Discount Will Offer");
		float Discount=sc.nextFloat();
		
		float Fin_Amt=(Amt*Discount/100);
		System.out.println("Discount Amount"+Fin_Amt);
		float Amt_After_Discount=(Amt-Fin_Amt);
		System.out.println("Final AMount Will be"+Amt_After_Discount);
	}
}
		
		