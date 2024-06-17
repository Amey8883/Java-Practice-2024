class Mobile{
	boolean playGames;
	boolean watchReels;

	public void playGames(boolean playGames)
	if(playGames==true)
	{
		System.out.println("playGames");
	}
	else if(playGames==false)
	{
		System.out.print("not play Games");
	}
}

public void watchReels(boolean watchReels)
if(playGames==true)
{
	System.out.println("Watching Reels");
}
else if(playGames==false)
{
	System.out.print("not Watching Reels");
}

class MobileDriverProg
{
	static Mobile m;
	public static void main(String[] args)
	{
		System.out.println("main starts");
	}
	try
	{
		MobileDriver.m.key=true;
		MobileDriver.m.Mobile(MobileDriver.m.key);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	try
	{
		mobile.m = new Mobile();
		m.key=true;
	}
}

