

public  class GradeEncrypt
{
	public static void main(String args[])
	{
		char grade='b';
		//--Encrypt the Grade..
		grade=(char)(grade+8);//type casting in to the char
		System.out.println("Encrypted Grade is : "+grade);
		
		//--Decrypt The Grade..
		grade=(char)(grade-8);
		System.out.println("Decrypted Grade is : 	"+grade);
		
	}
}