package com.example.fjojima.contactlistapp;

/**
 * Created by fjojima on 9/20/2018.
 */
public class Contact {
    private String ContactName;
    private String ContactNumber;


    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }
    public Contact (String name, String number) {
        this.setContactName(name);
        this.setContactNumber(number);
    }
}