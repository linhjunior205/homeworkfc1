package assignment7;

import java.util.*;

public class Assignment7 {

    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap gia tri phan tu cua mang: ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
        System.out.println("Cac phan tu ben trong mang la: ");
        for (float value : arrays) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static float findMax2(float[] arrays) {

        Arrays.sort(arrays);
        System.out.println("phan tu lon thu 2 trong mang la:  " + (arrays.length - 1));
        return arrays.length - 1;
    }

    public static void deleteOddNumber(float[] arrays) {
        int length = arrays.length - 1;
        for (int i = arrays.length - 1; i >= 0; i--) {
            if (arrays[i] % 2 != 0) {

                arrays[i] = arrays[i + 1];
                i--;
                length--;

            }

            System.out.println("Cap nhat phan tu trong mang: " + arrays[i]);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int size = scanner.nextInt();

        float[] arrays = new float[size];

        importData(arrays);

        printData(arrays);

        findMax2(arrays);

        deleteOddNumber(arrays);

    }
}
