package weather;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Weather {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new File("D:\\javathaytrinh\\Weather\\src\\weather\\output.txt"));
        Scanner input = new Scanner(new File("D:\\javathaytrinh\\Weather\\src\\weather\\input.txt"));
        double prev = input.nextDouble();
        while (input.hasNextDouble()) {
            double next = input.nextDouble();
            System.out.println("Reading: " + prev + " to " + next + ", change = " + (next - prev));
            ps.println(prev + " to " + next
                    + ", change = " + (next - prev));
            prev = next;
        }
    }

}
