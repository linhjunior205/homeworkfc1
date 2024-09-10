package assignment10;

import java.text.ParseException;
import java.util.Scanner;

public class Procces {

    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        
        Book book1 = new Book();
        book1.enterBookInfo(input);
        
        System.out.println(book1.toString());
        
    }

}
