
class Display
{
private int id;
private String name;

public String getName()
{
	return name;
}

public void setName(String n)

{
		name=n;
}

public void setid(int i)
{
	id=i;
}
public int getid()
{
return id;
}

}
	
		public class Private
		{
			public static void main(String args[])
			{
				Display Ds=new Display();
				Ds.setName=("AB");
				System.out.println(Ds.getName());
				Ds.setid(7273);
				System.out.println(Ds.getid());
			}
		}	
				