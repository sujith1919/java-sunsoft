class Abc implements Runnable
{
//	synchronized public void run()
	public void run()
	{
		//synchronized(this)
		{
		
			for(int i=1; i<=20; i++)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
				System.out.println(e);
				}
			}
		}
	}
}

public class SyncDemo
{
	public static void main(String args[])
	{
		Abc a1 = new Abc();
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		Thread t3 = new Thread(a1);

		t1.setName("a");
		t2.setName("b");
		t3.setName("c");

		t1.start();
		t2.start();
		t3.start();
	}
}