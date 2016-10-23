
package toba.newcustomer;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String state;
    private String city;
    private String zipcode;
    private String email;
    
    public User() {
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        state = "";
        city = "";
        zipcode = "";
        email = "";
    }
    public User(String firstName,String lastName,String phone,String address,String state,String city,String zipcode,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.state = state;
        this.city= city;
        this.zipcode = zipcode;
        this.email = email;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getState(){
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public String getCity(){
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getZipcode(String zipcode){
        return firstName;
    }
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}

