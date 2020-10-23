package phonebool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PhoneBook {
	private List<Contact> phoneBook = new ArrayList<Contact>();
	public void addContact(Contact contactObj) {
		phoneBook.add(contactObj);
	}
	public List<Contact> viewAllContacts(){
		return phoneBook;
	}
	public Contact viewContactGivenPhone(long phoneNumber) {
		for(int i=0;i<phoneBook.size();i++) {
			Contact c =phoneBook.get(i);
			if(c.getPhoneNumber()==phoneNumber)
				break;
		}
		return c;
	}
	public boolean removeContact(long phoneNumber) {
		boolean flag=false;
		for(int i=0;i<phoneBook.size();i++) {
			Contact c =phoneBook.get(i);
			if(c.getPhoneNumber()==phoneNumber)
				{phoneBook.remove(i);
				flag=true;}
		}
		return flag;
	}
}
