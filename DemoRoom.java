class Room
{
	int length;
	int width;
	Room()
	{
	System.out.println("-------------------");
	}
	Room(String str)
	{
		this();
	System.out.print("Area : ");
	}
	Room(int length,int width)
	{
		this("asdf");
		this.length = length;
		this.width = width;
		this.area();
	}
	public void area()
	{
		System.out.println(length * width);
	}
}
public class DemoRoom
{
	public static void main(String args[])
	{
		Room r1 = new Room(10,20);
		Room r2 = new Room(20,20);
		Room r3 = new Room(10,30);
//		r1.area();		
	}
}