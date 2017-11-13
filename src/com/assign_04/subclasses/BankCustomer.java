/***
 * BankAccount
 * 
 * @author Hussein Kadhum.
 * @version 1.0 alpha
 **/

package com.assign_04.subclasses;

import java.util.ArrayList;

import com.assign_04.superclasses.BankAccount;
import com.assign_04.superclasses.Human;

public class BankCustomer extends Human {
	
	private ArrayList<BankAccount> customerAccount = new ArrayList<BankAccount>(); //Attribute.

	/***
	 * Constructor method to generate the attributes of class Human.
	 * @param name, age
	 */
	
	public BankCustomer(String name, int age) {
		super(name, age);
	}

	/***
	 * Getter for CustomerAccount.
	 * @return customerAccount
	 */
	
	public ArrayList<BankAccount> getCustomerAccount() {
		return customerAccount;
	}
	
	/***
	 * Setter for CustomerAccount
	 * @param customerAccount
	 */

	public void setCustomerAccount(ArrayList<BankAccount> customerAccount) {
		this.customerAccount = customerAccount;
	}
	
	/***
	 * Method to create a new account and add it to the ArrayList customerAccount 
	 * @param bankAccount
	 */

	public void addAccount(BankAccount bankAccount) {
		customerAccount.add(bankAccount);
	}
	
	/***
	 * Method to deposit money to a specific account.
	 * @param accountNumber
	 * @param amount
	 */
	
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccount.size(); i++) {
			if(customerAccount.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccount.get(i).depositMoney(amount);
			}
		}
	}
	
	/***
	 * Method to withdraw money from a specific account.
	 * @param accountNumber
	 * @param amount
	 */
	
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccount.size(); i++) {
			if(customerAccount.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccount.get(i).withdrawMoney(amount);
			}
		}
	}
	
	/***
	 * Method print name and age and to convert all attributes in to a single string.
	 * @return CustomerAccount
	 */
	
	public String toString() {
		String result = "";
		result += "Customer: " + getName() + " Age: " + getAge() + "\n";
		for(int i = 0; i < customerAccount.size(); i++) {
			result += customerAccount.get(i) + "\n";
		}
		return result;
	}
	
	
}
