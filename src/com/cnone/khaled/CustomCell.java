/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cnone.khaled;

import com.codename1.components.ImageViewer;
import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;

/**
 *
 * @author khaledguedria
 */
public class CustomCell extends Container{

    
    //constructor
    public CustomCell(Resources theme, Contact contact) {
        
        //this
        this.setLayout(BoxLayout.x());
        
        
        //conponents
        Label nameLB = new Label(contact.getName());
        
        Label emailLB = new Label(contact.getEmail());
        emailLB.getAllStyles().setFgColor(0x808080);
        
        Container credentialsCtn = new Container(BoxLayout.y());
        credentialsCtn.addAll(nameLB, emailLB);
        
        ImageViewer imgViewer = new ImageViewer(theme.getImage(contact.getImage()));
        
        this.addAll(imgViewer, credentialsCtn);
        
        
    }
        
    
    
}
