package lecture45;

import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // in ra 10 lan I am so smart 

        for (int i = 1; i <= 10; i++) {
            System.out.println("I am so smart ");
        }
        System.out.println("s-m-r-t,,, I mean s-m-a-r-t");

        // nhan theo i
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " squared " + i * i);
        }

        //in ra giam dan theo lenh update la i--
        System.out.println("T-minus: ");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + ",");
        }
        System.out.println("blastoff");
        System.out.println("The end.");

    }
}
