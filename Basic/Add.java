import java.util.Scanner;

public class Add 
{

    public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number ");
		int iNo1=sc.nextInt();
		System.out.println("enter the 2nd number ");
		int iNo2=sc.nextInt();
		System.out.println("enter the 3rd number ");
		int iNo3=sc.nextInt();
		
		int sum=(iNo1+iNo2+iNo3);
		
		System.out.println("the sum is");
        System.out.println(sum);
		//Scanner sc=new Scanner(System.in);
		//boolean b1=sc.hasNextInt();
		//System.out.println(b1); 
		String str=sc.nextLine();
		System.out.println(str);
    }
}

 