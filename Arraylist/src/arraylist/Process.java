package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Process {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String check;
        do {
            System.out.println("------Menu------");
            System.out.println("1. Nhap data.");
            System.out.println("2. Xuat data.");
            System.out.println("3. Tim Max2.");
            System.out.println("4. Xoa so le.");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    numbers = ArrayListExercise.EnterData(numbers);
                    break;
                case 2:
                    ArrayListExercise.DisplayData(numbers);
                    break;
                case 3:
                    ArrayListExercise.findMax2(numbers);

                    break;
                case 4:
                    ArrayListExercise.deleteOddNumber(numbers);
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
            System.out.println("Nhap yes de tiep tuc chuong trinh");
            check = scanner.nextLine();
        } while (check.equals("yes"));
    }

}
