package In;
import java.util.Scanner;
public class In {
	public static void main( String [] args) {
		System.out.println("How old are you?");
		Scanner in = new Scanner(System.in);
		int age;
		age = in.nextInt();
		System.out.println("nice, U're " + age);
	}
}
