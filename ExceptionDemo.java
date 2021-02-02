import java.io.*;

class A
{
		public void abc() throws NullPointerException, IOException, UserException
		{
			int a = 300;
			for(int i=1;i<300;i++)
			{
				System.out.println(i);
				int res = a/(a-i);
				if(i==150)
					throw new NullPointerException();
				if(i==120)
					throw new IOException();
				if(i==200)
					return;
				if(i==80)
					throw new UserException();
				if(i==60)
					throw new UserException("Just for Demo");
			}
			System.out.println("program continues..................!!!!!!");
		}
		public void xyz() throws NullPointerException, IOException, UserException
		{
			abc();
		}
		public void atoz() throws NullPointerException, IOException
		{
				try
				{
					xyz();
				}
				catch(UserException e)
				{
						System.out.println("User defined exception handler");
						e.display();
						e.printStackTrace();
						System.out.println("Reason :" +e.getMessage());
				}	
		}
}


public class ExceptionDemo
{	
	public static void main(String args[])
	{
		try
		{
			A a1 = new A();
			a1.atoz();
		}
		catch(IOException e)
		{
			System.out.println("input ouput error occured.........");
		}	
		catch(ArithmeticException e)
		{
			System.out.println("go to school");
		}
		catch(Exception e)
		{
			System.out.println("Default Exception handler....");
		}
		finally
		{
			System.out.println("Finally got executed FINALLY");
		}
			System.out.println("main method continues......");
	}	
}
class UserException extends Exception
{
	public UserException()
	{	
	}
	public UserException(String msg)
	{
		super(msg);
	}
	public void display()
	{
		System.out.println("User exception defined finally..........");
	}
}