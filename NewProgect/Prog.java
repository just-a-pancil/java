package NewProgect;

import java.util.Scanner;

public class Prog {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 1;
        String task[] = new String[32];
        String october[] = new String[32];
        for (int i = 1; i < october.length; i++) {
            october[i] = "" + i;
        }
        System.out.println("Please enter the number of the day");
        day = in.nextInt();
        task[day] = "to do smth";
        System.out.printf("On %s th october you have planed: %s \n", october[day], task[day]);
        in.close();
    }
}
