
package toba.newcustomer;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String state;
    private String city;
    private String zipCode;
    private String email;
    private String userName;
    private String passWord;
    
    public User() {
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        state = "";
        city = "";
        zipCode = "";
        email = "";
        userName = "";
        passWord = "";
    }
    public User(String firstName,String lastName,String phone,String address,String state,String city,String zipcode,String email, String userName, String passWord){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.state = state;
        this.city= city;
        this.zipCode = zipcode;
        this.email = email;
        this.userName = userName;
        this.passWord = passWord;
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
    
    public String getZipCode(){
        return zipCode;
    }
    
    public void setZipCode(String zipcode) {
        this.zipCode = zipcode;
    }
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserName(){
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
}
    public String getPassWord(){
        return passWord;
    }
    
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}

