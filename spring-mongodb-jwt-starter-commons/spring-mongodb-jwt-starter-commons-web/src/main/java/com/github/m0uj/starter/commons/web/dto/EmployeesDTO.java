package com.github.m0uj.starter.commons.web.dto;

/**
 * Created by Jihed-pc on 27/03/2018.
 */
public class EmployeesDTO extends AbstractDTO {
    private String username;

    private String password;

    private String FirstName;

    private String LastName;

    private String Immatriculation;

    private int NCIN;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getImmatriculation() {
        return Immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        Immatriculation = immatriculation;
    }

    public int getNCIN() {
        return NCIN;
    }

    public void setNCIN(int NCIN) {
        this.NCIN = NCIN;
    }
}
