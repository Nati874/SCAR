package main.java.com.scar.model;

import java.time.LocalDate;

public abstract class Person {
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected LocalDate birth;
    protected String email;
    protected String userID;

    public Person(String firstName, String middleName, String lastName, LocalDate birth, String email, String userID){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birth = birth;
        this.email = email;
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getUserID() {
        return userID;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

}
