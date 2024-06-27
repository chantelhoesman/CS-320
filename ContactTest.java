package com.example;
import junit.framework.TestCase;


public class ContactTest extends TestCase {
	
    public void testContactCreation() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Elm St");
        assertEquals("12345", contact.getContactID());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Elm St", contact.getAddress());
    }
	
	public void testInvalidFirstName() {
		try {
            new Contact("12345", "Tom", "Doe", "1234567890", "123 Elm St");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid first name", e.getMessage());
        }
	}
	public void testInvalidLastName() {
		try {
			new Contact("12345", "Tom", "Doe", "1234567890", "123 Elm St");
		} catch (IllegalArgumentException e) {
            assertEquals("Invalid last name", e.getMessage());
		}
	}
	public void testInvalidPhone() {
		try {
			new Contact("12345", "Tom", "Doe", "1234567890", "123 Elm St");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Phone Number", e.getMessage());
		}
	}
	public void testInvalidAddress() {
		try {
			new Contact("12345", "Tom", "Doe", "1234567890", "123 Elm St");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Address", e.getMessage());
		}
	}
}
