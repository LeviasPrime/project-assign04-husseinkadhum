/***
 * BankAccount
 * 
 * @author Hussein Kadhum.
 * @version 1.0 alpha
 **/

package com.assign_04.superclasses;

public class Human {
	private String name = "";
	private int age = 0; //Attributes.
	
	/***
	 * Constructor method to generate the attributes.
	 * @param name
	 * @param age
	 */

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/***
	 * Getter for Name.
	 * @return name
	 */

	public String getName() {
		return name;
	}
	
	/***
	 * Setter for Name.
	 * @param name
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/***
	 * Getter for Age.
	 * @return age
	 */

	public int getAge() {
		return age;
	}
	
	/***
	 * Setter for Age.
	 * @param age
	 */

	public void setAge(int age) {
		this.age = age;
	}
	
}
