package com.example;
import java.util.ArrayList;
import com.example.Contact;

public class ContactService {
	//Create an array to hold contact
	ArrayList<Contact> contactList = new ArrayList(); 
	
	//Method for creating a contact
	public void createContact(Contact contact) {
		//Search for contact id if it does not exist create
		contactList.add(contact);
	
	}
	//Method for deleting a contact
    public void deleteContact(String contactID) {
    	//Search for contact id if found delete
    	for(Contact contact: contactList) {
    		if (contact.getContactID().equals(contactID)) {
    			contactList.remove(contact);
    		}
    	}
    	}
    
    //Method for updating a contact
    public boolean updateContact(String contactID, String firstName, String lastName, String phone,
            String address) {
        //run through loop again
        for (Contact contact : contactList) {
           
        	if (contact.getContactID().equals(contactID)) {
        	  contact.setFirstName(firstName);
        	  contact.setLastName(lastName);
        	  contact.setPhone(phone);
        	  contact.setAddress(address);
        	  
          
                return true;
        	}
            }
        
        //else return false
        return false;
	}
    public Contact findContact(String contactID) {
        //run through loop again
        for (Contact contact : contactList) {
           
        	if (contact.getContactID().equals(contactID)) {
        	 return contact;
        	}
        }
        return null;
	}
}


