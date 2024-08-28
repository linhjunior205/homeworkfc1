package lecture6;

import java.util.*;

public class Lecture6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Arrays;
        // khai bao 1 mang:
        int[] numbers = new int [50]; // mang nay co 50 phan tu.
        
        numbers[0] = 30; // index vao chi so de lay gia tri tuong ung
        numbers[6] = 32;
        
        //nhap cac phan tu vao mang bang vong lap for:
        System.out.println("Nhap so phan tu n vao mang: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + (i +1));
            numbers[i] = sc.nextInt();
        }
        //xuat cac phan tu cua mang vua nhap:
        for(int i = 0; i < n; i++){
            System.out.println(numbers[i]);
        }
        //Tinh tong cac phan tu trong mang:
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += numbers[i];
        }
        System.out.println("Tong cac phan tu co trong mang la: " + sum);
        
        //weather answer:
        
        System.out.println("How many day: ");
        int day = sc.nextInt();
        int[] temps = new int[day];
        int sum = 0;
        for(int i=0; i<day; i++){
            System.out.println("Day " + (i + 1) + "'s hight temp");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        int average = sum/day;
        int count = 0;
        
        for(int i=0; i<day; i++){
            if(temps[i] > average){
                count++;
            }
        }
        System.out.printf("Average temp = %.1f", average);
        System.out.println();
        System.out.println(count + " days above average");
        
        
        
        //swapping values (hoan doi gia tri):
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println(a + " " + b);
        
        //Array parameter:
        public static double average(int[] numbers){
            int sum = 0;
            for(int i = 0; i <numbers.length; i+){
                sum += numbers;
            }
            return (double) sum/ numbers.length;
        }
        
        
        //Array parameter9(call):
        
        public static void main(String[] args) {
            // figure out the average TA IQ
            int[] iq = {126, 84, 149, 167, 95};
            double avg = average(iq);
            System.out.println("Average IQ = " + avg);
        }
        
        //Array return: 
        public static int[] stutter (int [] numbers){
            int [] result = new int[2 * numbers.length];
            for(int i = 0; i < numbers.length; i++){
                result[2 * i] = numbers[i];
                result[2 * i + 1] = numbers;
            }
            return result;
        }
        
                
    }

}
