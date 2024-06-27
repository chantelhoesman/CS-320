package com.example;

public class ContactServiceTest {
	//Create a main driver to call service
	public static void main(String args[]) {
		//Create a new contact
		Contact contact = new Contact("12345", "Tom", "Doe", "1234567890", "123 Elm St");
		ContactService cs = new ContactService();
		cs.createContact(contact);
		System.out.println("Test of create new contact");
		System.out.println(contact);
		Contact contact2 = new Contact("54321", "Mike", "Joe", "7755532161", "333 Hurst St");
		cs.createContact(contact2);

		System.out.println(contact2);
		//Update newly created contact.
		cs.updateContact("54321", "Thomas", "Johns", "1236547891", "1 Cherry Lane");
		contact = cs.findContact("54321");
		System.out.println("Test of update new contact");
		System.out.println(contact);
		//Delete contact
		cs.deleteContact("12345");
		System.out.println("Test of delete new contact");
		System.out.println(contact);
	}

}