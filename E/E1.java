import java.util.Scanner;
class E1
{
	public static void main(String[] args) 
	{
		System.out.println("Hi! say something");
		Scanner in = new Scanner(System.in);
		String phrase;
		phrase = in.nextLine();
		System.out.println("you just said: " + "\"" + phrase + "\"");
	}
}