import java.util.Scanner;

public class Incometax
{
	public static void main(String args[])
	{
			System.out.println("Enter your income");
		Scanner sc=new Scanner(System.in);
		
	
		float income = sc.nextFloat();
		float tax=0;
		if(income>=250000 && income<=500000)
		{
		tax = 0.05f * (income - 250000);
		}
    
		if (income >= 500000 && income <= 1000000)
		{
        tax =0.20f *( income - 500000);
		}

		if (income >= 1000000)
		{
        tax =0.30f * (income - 1000000);
		}
    
    System.out.println(tax);

    }
}