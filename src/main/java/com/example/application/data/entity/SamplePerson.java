package com.example.application.data.entity;

import java.time.LocalDate;
import javax.persistence.Entity;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@Entity
public class SamplePerson extends AbstractEntity {

    private String firstName;
    private String lastName;
    private String Username;
    private String email;
    private String phone;
    private LocalDate dateOfBirth;
    private String occupation;
    private String password;
    private String confPassword;
    private boolean important;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
     public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setUsername(String Username){
        this.Username = Username;
    }
    public String getUsername(){
        return Username;
    }
   
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setConfirmpassword(String confpassword) {
        this.confPassword = confpassword;
    }
    public String getConfirmpassword(){
        return confPassword;
    }
    
   
    
   
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public boolean isImportant() {
        return important;
    }
    public void setImportant(boolean important) {
        this.important = important;
    }

}
