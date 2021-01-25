package com.example.databinding;

public class User {

    private String firstname;
    private String lastname;
    private boolean button;

    public User(String firstname,String lastname,boolean button)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.button=button;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", button=" + button +
                '}';
    }
}
