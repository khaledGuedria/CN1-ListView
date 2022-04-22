/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cnone.khaled;

/**
 *
 * @author khaledguedria
 */
public class Contact {
    
    //var
    private String name;
    private String email;
    private String image;
    
    
    //Constructors
    public Contact(){
        
    }
    //..
    public Contact(String name, String email, String image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }
    
    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    //..

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", email=" + email + ", image=" + image + '}';
    }
    
    
    
}
