//3>performing Multiple Task By Multiple Thread

class PlayAudio extends Thread
{
	public void run()
	{
		System.out.println("hey VLC Play Audio");
	}
}	

class PlayVideo extends Thread
{
	public void run()
	{	
		
		System.out.println("hey VLC Play Video");
	}
}	


class UpVolume extends Thread
{
	public void run()
	{	
		
		System.out.println("hey VLC Up the Volume");
	}
}	

class DownVolume extends Thread
{
	public void run()
	{	
		
		System.out.println("hey VLC Down volume");
	}
}	



 class VLC
{
	public static void main(String args[])
	{
		PlayAudio PA=new PlayAudio();
		PA.start();
		PlayVideo PV=new PlayVideo();
		PV.start();
		UpVolume UV=new UpVolume();
		UV.start();
		DownVolume DV=new DownVolume();
		DV.start();
	}
}	