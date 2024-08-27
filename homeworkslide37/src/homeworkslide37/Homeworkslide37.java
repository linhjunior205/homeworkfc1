package homeworkslide37;

import java.util.*;

public class Homeworkslide37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int operands = rd.nextInt(4) + 2;
        int sum = rd.nextInt(10) + 1;
        System.out.print(sum);

        for (int i = 1; i <= operands; i++) {
            int n = rd.nextInt(10) + 1;
            sum += n;
            System.out.print("+" + n);
        }
        System.out.print(" = ");

       int guess = sc.nextInt();
        if (guess == sum) {
            System.out.println("1");
        } else {
           System.out.println("wrong ! The answer was " + sum);
       }
    }
}
