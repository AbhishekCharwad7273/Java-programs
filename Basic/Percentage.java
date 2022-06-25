import java.util.Scanner;

public class Percentage
{

    public static void main(String[] args) 
	{
		int iNo;
		int total_marks=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("how many subject marks enter");
		iNo=sc.nextInt();
		int Marks_outof=100;
		for(int iCnt=1;iCnt<=iNo;iCnt++)
		{
			System.out.println("enter the marks subject "+iCnt);
			iNo=sc.nextInt();
			total_marks=total_marks+iNo;
		}
		System.out.println(total_marks);

		float percentage=((total_marks/Marks_outof)*100);
		System.out.println("percentage ::"+ percentage);

		/*
		System.out.println("enter the 1st subject marks ");
		int iNo1=sc.nextInt();
		System.out.println("enter the 2nd subject marks ");
		int iNo2=sc.nextInt();
		System.out.println("enter the 3rd subject marks ");
		int iNo3=sc.nextInt();
		System.out.println("enter the 4th subject marks ");
		int iNo4=sc.nextInt();
		System.out.println("enter the 5th subject marks ");
		int iNo5=sc.nextInt();
	
		int total_score=(iNo1+iNo2+iNo3+iNo4+iNo5);
		System.out.println("enter out of marks");
		float total_marks=sc.nextFloat();
		float percentage=((total_score/total_marks)*100);
		System.out.println("percentage ::"+ percentage);
    */
	}
}

 