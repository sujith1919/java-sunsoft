import java.util.Scanner;

public class KeyInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("NAME : ");
		String name = sc.next();

		System.out.print("ENTER AGE :");
		int age = sc.nextInt();

		System.out.print("Married: ");
		boolean married = sc.nextBoolean();
		


		System.out.println("----------------------------");
		System.out.println("You are " +name);
		System.out.println("and your age after 20 years is " + (age+20));
		System.out.println(" Married " + married + " lol ");
	}
}