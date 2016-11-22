package toba.transaction;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import toba.data.Account;

@Entity
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;
    
    private Account source;
    private Account destination;
    
    private double amt;
    
    public Transaction(){
        
    }
    
    public Transaction(Account source, Account destination, double amt) {
        this.source = source;
        this.destination = destination;
        this.amt = amt;
    }
    

    public Account getSource() {
        return source;
    }

    public void setSource(Account source) {
        this.source = source;
    }

    public Account getDestination() {
        return destination;
    }

    public void setDestination(Account destination) {
        this.destination = destination;
    }

    public double getAmount() {
        return amt;
    }

    public void setAmount(double amt) {
        this.amt = amt;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long id) {
        this.transactionId = id;
    }
    

    
}
