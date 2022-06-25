public class Math
{
public static void main(String args[])
{
	Multi M=new Multi();
	M.multiplication   ();
	M.addition();
}	
}


class base
{

void addition()
{
int a=10;
int b=20;
int c=a+b;
System.out.println("Addtion is " + c);
}
}

class Multi extends base
{
void multiplication()
{
int a=5;
int b=6;
int c=a*b;
System.out.println("multiplication  is " + c);
}
}
