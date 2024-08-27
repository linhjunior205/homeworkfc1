package lecture45;

import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while (num <= 500) { // gia tri num khi lon hon 500 thi thoat khoi loop
            System.out.println(num + " ");
            num *= 2;
        }

        //nhap so de cong don khi nao nhap -1 se thoat khoi
        int sum = 0;
        int number = 1;
        while (number != -1) {
            System.out.print("Enter a number (-1 to quit) : ");
            number = sc.nextInt();
            sum += number;
        }
        System.out.println("The total is " + sum);
    }
}
