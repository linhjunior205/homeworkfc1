package lecture45;

import java.util.Scanner;

public class forLongNhau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hang ngang tuong ung voi j > in ra 10 dau *
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // in ra so  tuong ung voi bao nhieu chu so
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
