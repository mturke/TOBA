
package toba.newcustomer;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence .GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import toba.data.Account;
import toba.data.AccountDB;
import toba.transaction.Transaction;
import toba.transaction.TransactionDB;


@Entity
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String state;
    private String city;
    private String zipCode;
    private String email;
    private String username;
    private String password;
    
    
    public User() {
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        state = "";
        city = "";
        zipCode = "";
        email = "";
        username = "";
        password = "";
    }
    public User(String firstName,String lastName,String phone,String address,String state,String city,String zipcode,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.state = state;
        this.city= city;
        this.zipCode = zipcode;
        this.email = email;
        this.username = lastName + zipcode;
        this.password = "welcome1";
        
    }

    public Long getUserId(){
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
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
        return username;
    }
    
    public void setUserName(String userName) {
        this.username = userName;
}
    public String getPassWord(){
        return password;
    }
    
    public void setPassWord(String passWord) {
        this.password = passWord;
    }

    public double getCheckingBalance(){
        Account checking = AccountDB.selectAccount(this, "CHECKING");
        return checking.getBalance();
    }

    public double getSavingsBalance(){
        Account savings = AccountDB.selectAccount(this, "SAVINGS");
        return savings.getBalance();
    }
    
    public List<Transaction> getTransactions() {
        List<Transaction> trans = TransactionDB.getTransactions(this);
        return trans;
    }
}

