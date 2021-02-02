class Room
{
	int length;
	int width;
	Room()
	{
		length = 20;
		width = 15;
	}
	Room(int x,int y)
	{
		length = x;
		width = y;
	}
	public void area()
	{
		System.out.println(length * width);
	}
	public void perimeter()
	{
		int p = 2;
		System.out.println(p * length * width);
	}
}
public class RoomMain
{
	public static void main(String args[])
	{
		Room r1 = new Room();
		Room r2 = new Room(20,20);
	//	r1 = new Room();
		r1.area();
		r2.area();
		r1.perimeter();
		System.out.println("lololololololol");

		r1.length = 35;
		r2.width = 10 ;
		r1.area();
		r2.area();
		System.out.println("lololololololol");

		r1=r2;
		r1.length = 23;
		r1.width = 21;
		r1.area();
		r2.area();
		System.out.println("lololololololol");

		
		
	}
}