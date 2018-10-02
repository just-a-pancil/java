import java.util.Scanner;
public class Array {
	public static void main( String [] args) {
		Scanner in = new Scanner(System.in);
		int[] Array = new int [2];
		String[] b = {"Ты молодец", "Ты пидор"};
		System.out.println("1 или 2?");
		int chislo;
		chislo = in.nextInt();
		if (chislo == 1){
			System.out.println(b[0]);
		}
		else {
			System.out.println(b[1]);
		}
	}
}
