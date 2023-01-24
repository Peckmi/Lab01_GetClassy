package ProductFile;

import java.util.Calendar;

public class Product {
    private String ID;
    private String Name;
    private String Description;

    private int YOB;

    public Product(String ID, String firstName, String lastName, String title, int YOB) {
        validateAge(YOB);
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
        this.YOB = YOB;
    }

    public Product(String id, String firstName, String lastName, int yob) {
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return Name;
    }
    public void setFirstName(String firstName) {
        this.Name = Name;
    }

    public String getLastName() {
        return Description;
    }
    public void setLastName(String lastName) {
        this.Description = Description;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        validateAge(YOB);
        this.YOB = YOB;
    }

    private void validateAge(int YOB) throws ExceptionInInitializerError {
        if (!(YOB >= 1940 && YOB <= 2010)) {
            throw new ExceptionInInitializerError("YOB must be between 1940 and 2010.");
        }
    }

    public String fullName() { return this.Name + " " + this.Name; }


    public String toCSVDataRecord() { return this.ID + ", " + this.Description + ", " + this.Name + ", "+ this.YOB; }
}