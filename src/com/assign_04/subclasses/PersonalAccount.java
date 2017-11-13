/***
 * PersonalAccount
 * 
 * @author Hussein Kadhum.
 * @version 1.0 alpha
 **/

package com.assign_04.subclasses;

import java.util.UUID;
import com.assign_04.superclasses.BankAccount;

public class PersonalAccount extends BankAccount {
	
	/***
	 * Constructor method to generate the attributes of class BankAccount.
	 */

	public PersonalAccount(){
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6)); //Sets and generates a string of 6 random letters and numbers.
		this.setBalance(0.0); //Sets the default balance to "0".
		this.setAccountType("Personal account"); //Sets the default account type to "Personal account".
	}
}
