package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercise {

    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("so luong phan tu cua mang: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("numbers[" + i + "]=");
            int value = scanner.nextInt();
            numbers.add(value);
        }
        return numbers;
    }

    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.println("number[]=" + Arrays.toString(numbers.toArray()));
    }

    public static int findMax2(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        int max2 = numbers.get(numbers.size() - 2);
        System.out.println("MAX 2: " + max2);
        return max2;
    }

    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number % 2 != 0);

        for (int number : numbers) {
            System.out.print( number);
        }
    }
}
