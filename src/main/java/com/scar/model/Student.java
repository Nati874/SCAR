package main.java.com.scar.model;

import java.time.LocalDate;

public class Student extends Person{
    private String major;
    private int year;
    public Student(String firstName, String middleName, String lastName, LocalDate birth, String email, String userID, int year, String major){
        super(firstName, middleName, lastName, birth, email, userID);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
