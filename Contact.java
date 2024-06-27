package com.example;

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//constructors created 
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		super();
		if (contactID == null || contactID.length() > 10) {
			  throw new IllegalArgumentException("Invalid contact ID");
			}
		if (firstName == null || firstName.length() > 10) {
			  throw new IllegalArgumentException("Invalid First Name");
			}
		if (lastName == null || lastName.length() > 10) {
			  throw new IllegalArgumentException("Invalid Last Name");
			}
		if (phone == null || phone.length() != 10) {
			  throw new IllegalArgumentException("Invalid Phone Number");
			}
		if (address == null || address.length() > 30) {
			  throw new IllegalArgumentException("Invalid Address");
			}
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	//getters and setters created
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			  throw new IllegalArgumentException("Invalid First Name");
			}
		this.firstName = firstName;
		
	}
	public String getLastName() {
		
		return lastName;
	}
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			  throw new IllegalArgumentException("Invalid Last Name");
		}
			  this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10) {
			  throw new IllegalArgumentException("Invalid Phone Number");
			}
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			  throw new IllegalArgumentException("Invalid Address");
			}
		this.address = address;
	}
	public String getContactID() {
		return contactID;
	}
	//to string created
	@Override
	public String toString() {
		return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName + ", phone="
				+ phone + ", address=" + address + "]";
	}
	
	
}
