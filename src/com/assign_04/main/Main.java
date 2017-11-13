/***
 * Main
 * 
 * @author Hussein Kadhum.
 * @version 1.0 alpha
 **/

package com.assign_04.main;

import com.assign_04.subclasses.PersonalAccount;
import com.assign_04.subclasses.SavingAccount;
import com.assign_04.superclasses.BankAccount;
import com.assign_04.subclasses.BankCustomer;

public class Main {

	public static void main(String[] args) {
		String account = ""; //Declare String account
		
		BankCustomer bc = new BankCustomer("Hussein", 18); //instantiate BankCustomer.
		bc.addAccount(new BankAccount()); //Creates BankAccount under BankCustomer.
		bc.addAccount(new PersonalAccount()); //Creates PersonalAccount under BankCustomer.
		bc.addAccount(new SavingAccount()); //Creates SavingAccount under BankCustomer.
		System.out.println(bc.toString()); //Prints BankCustomer to string.
		
		account = bc.getCustomerAccount().get(0).getAccountNumber(); //Sets account to BankCustomer[0].
		System.out.println("Depositing 30.0 to the first account"); 
		bc.depositToAccount(account, 30.0); //Deposits 30.0 to account.
		System.out.println(bc.toString()); //Prints BankCustomer to string.
		
		System.out.println("Withdrawing 200.0 from the first account");
		account = bc.getCustomerAccount().get(1).getAccountNumber(); //Sets account to BankCustomer[1].
		bc.withdrawFromAccount(account, 200.0); //Withdraws 200.0 from account.
		System.out.println(bc.toString()); //Prints BankCustomer to string.
		
		System.out.println("Depositing 200.0 to the first account");
		account = bc.getCustomerAccount().get(2).getAccountNumber(); //Sets account to BankCustomer[2].
		bc.depositToAccount(account, 200.0); //Deposits 200.0 to account.
		System.out.println(bc.toString()); //Prints BankCustomer to string.
	}

}
