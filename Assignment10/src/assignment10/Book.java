package assignment10;

import java.text.ParseException;
import java.util.*;

public class Book {
    private String bookID;
    private String title;
    private Author author;
    
    public Book(String bookID, String title, Author author){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }
    
    public Book(){
        
    }
     public void enterBookInfo(Scanner input) throws ParseException{
        
        System.out.println("Enter BookID: ");
        this.bookID = input.nextLine();
        System.out.println("Title: ");
        this.title = input.nextLine();
         System.out.println();
        System.out.println("-----Author Information----: ");
         System.out.println();
        this.author = new Author();
        this.author.enterAuthorInfo(input);
        
        
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
   
    public String toString(){
        return "BookID: " + bookID+ "|" + " Title: " + title + "|" + " Author: " + author;
    }
    
    
    
}
