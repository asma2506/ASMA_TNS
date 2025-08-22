package model;

public class Account {
	
	    private int accountID;
	    private int customerID;
	    private String type;   
	    private double balance;

	    
	    public Account(int accountID, int customerID, String type, double balance) {
	        this.accountID = accountID;
	        this.customerID = customerID;
	        this.type = type;
	        this.balance = balance;
	    }

	   
	    public int getAccountID() { 
	    	return accountID; 
	    	}
	    public int getCustomerID() { 
	    	return customerID; 
	    	}
	    public String getType() { 
	    	return type; 
	    	}
	    public double getBalance() {
	    	return balance; 
	    	}

	   
	    public void setAccountID(int accountID) {
	    	this.accountID = accountID;
	    	}
	    public void setCustomerID(int customerID) {
	    	this.customerID = customerID; 
	    	}
	    public void setType(String type) { 
	    	this.type = type; 
	    	}
	    public void setBalance(double balance) { 
	    	this.balance = balance; 
	    	}

	    @Override
	    public String toString() {
	        return "Account ID: " + accountID + ", Customer ID: " + customerID +
	               ", Type: " + type + ", Balance: " + balance;
	    }
	}



