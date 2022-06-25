
import java.util.Scanner;

public class Miles
{
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the kilometer");
	double kilo=sc.nextDouble();
	
	double miles=(kilo/1.6);
	System.out.println("kilo to miles"+ miles);
	
}
}