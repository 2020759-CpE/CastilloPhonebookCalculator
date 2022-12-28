/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonebookjava;

import java.io.*;

/**
 *
 * @author wacky
 */
public class Information implements Serializable
{
    private String lastname;
    private String firstname;
    private String email;
    private String mobile;
    private String birthday;
    private String address;
    private Sim sim;

    public Information(String lastname, String firstname, String email, String mobile, String birthday, String address, Sim sim) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.mobile = mobile;
        this.birthday = birthday;
        this.address = address;
        this.sim = sim;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }
    
    
}
