/***
 * BankAccount
 * 
 * @author Hussein Kadhum.
 * @version 1.0 alpha
 **/

package com.assign_04.superclasses;

import java.util.UUID;
import com.assign_04.interfaces.BankOperations;

public class BankAccount implements BankOperations {
	
	private String accountNumber = "";
	private String accountType = ""; //Attributes.
	private double balance = 0;
	
	/***
	 * Constructor method to generate the attributes.
	 */
	
	public BankAccount(){
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6); //Sets and generates a string of 6 random letters and numbers.
		this.balance = 0; //Sets the default balance to "0".
		this.accountType = "Bank account"; //Sets the default account type to "Bank account".
	}
	
	/***
	 * Getter for AccountNumber.
	 * @return accountNumber
	 */
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	/***
	 * Setter for AccountNumber.
	 * @param accountNumber
	 */
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/***
	 * Getter for AccountType.
	 * @return accountType
	 */
	
	public String getAccountType() {
		return accountType;
	}
	
	/***
	 * Setter for AccountType.
	 * @param accountType
	 */
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	/***
	 * Getter for Balance.
	 * @return balance
	 */
	
	public double getBalance() {
		return balance;
	}
	
	/***
	 * Setter for Balance.
	 * @param balance
	 */
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/***
	 * Method to withdraw money.
	 * @param amount
	 */
	
	public void withdrawMoney(double amount) { 
		if(amount >= 0) { //uses an if-statement to set the balance to a new value of minus amount.
			setBalance(getBalance() - amount);
		}else { //else statement tells that negative values aren't an option.
			System.out.println("You can't withdraw a negative value.");
		}
		
	}
	
	/***
	 * Method to deposit money.
	 * @param amount
	 */

	public void depositMoney(double amount) {
		if(amount >= 0) { //uses an if-statement to set the balance to a new value of plus amount.
			setBalance(getBalance() + amount);
		}else { //else statement tells that negative values aren't an option.
			System.out.println("You can't deposit a negative value.");
		}
		
	}

	/***
	 * Method to convert all attributes in to a single string.
	 * @return AccountNumber
	 * @return Balance
	 * @return AccountType
	 */

	public String toString() {
		return "BankAccount" + " [AccountNumber = " + getAccountNumber() +", Balance = " + getBalance() + ", AccountType = " + getAccountType() + "]";
	}
	
	
	

}
