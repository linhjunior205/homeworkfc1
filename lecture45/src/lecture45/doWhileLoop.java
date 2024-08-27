package lecture45;

import java.util.Scanner;

public class doWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pharase;
        do {
            System.out.println("Type your password: ");
            pharase = sc.next();

        } while (!pharase.equals("linhdepzai"));// equals la cau lenh so sanh chuoi

    }
}
