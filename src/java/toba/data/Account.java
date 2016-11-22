
package toba.data;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import toba.newcustomer.User;
import toba.transaction.Transaction;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String accountType;
    private double balance;
    private User accountOwner;

    
    public Account() {
    }

    
    public Account(String accountType, double startingBalance, User accountOwner) {
        this.accountType = accountType;
        this.balance = startingBalance;
        this.accountOwner = accountOwner;
        
    }
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double startingBalance) {
        this.balance = startingBalance;
    }

    public User getUser() {
        return accountOwner;
    }

    public void setUser(User accountOwner) {
        this.accountOwner = accountOwner;
    }

    
    public void credit(double startingBalance){
        this.balance += startingBalance;
    }
    
    public void debit(double startingBalance){
        
        this.balance -= startingBalance;
    }
    
    /*
    
    
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
        private List<Transfer> transfer;
    
    public List getTranfern(){
        return transfer;
    }
   
    public void addTransfer(Transfer transfer){
        this.transfer.add(transfer);
    } */
    
     
    public User getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(User accountOwner) {
        this.accountOwner = accountOwner;
    }
    
    
    
    }


     