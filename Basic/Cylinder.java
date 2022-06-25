
class Display
{
private int height;
private int radius;

public int getradius()
{
	return radius;
}

public void setradius(int f)

{
		radius=f;
}

public void setid(int i)
{
	height=i;
}
public int getheight()
{
return height;
}

}
	
		public class Cylinder
		{
			public static void main(String args[])
			{
				Display Ds=new Display();
				Ds.setradius(2);
				System.out.println(Ds.getradius());
				Ds.setid(15);
				System.out.println(Ds.getheight());
			}
		}	
				