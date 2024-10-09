package assignment10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Author {

    private String authorID;
    private String name;
    private Date dateOfBirth;

    public Author(String authorID, String name, Date dateOfBirth) {
        this.authorID = authorID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    }

    public Author() {

    }

    public void enterAuthorInfo(Scanner input) throws ParseException {
        System.out.println("Enter AuthorID: ");
        this.authorID = input.nextLine();
        System.out.println("Name author: ");
        this.name = input.nextLine();

        String dateOfBirthString;
        System.out.println("Date of birth: ");
        dateOfBirthString = input.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfBirth = format.parse(dateOfBirthString);

    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "AuthorID: " + authorID + "|" + " Name Author:  " + name + "|" + " Dateofbirth: " + format.format(dateOfBirth);
    }

}
