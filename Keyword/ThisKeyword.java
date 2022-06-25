class Test

{
	int i;//this keyword used current class instance variable
		public void get(int i)
		{ 
			this.i=i;//without This it will print i value is 0
			
		}

		public void display()
		{
			System.out.println(i);
		}
}

public class ThisKeyword
{
		public static void main(String args[])

		{
			Test T=new Test();
			T.get(10);
			T.display();
			
		}
}		