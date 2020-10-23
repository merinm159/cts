package phonebool;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PhoneBook p=new PhoneBook();
		Scanner input=new Scanner(System.in);
		boolean exit=false;
		do {
		System.out.println("Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone \n4.Remove contact\n5.Exit\n");
		System.out.print("Enter your choice:");
		int x=Integer.parseInt(input.nextLine());
		switch (x) {
		case 1: System.out.print("Add a Contact:\nEnter the First Name: ");
				String fmainame=input.nextLine();
				System.out.println("Enter the Last Name: ");
				String lname=input.nextLine();
				System.out.println("Enter the Phone No.: ");
				long phonenumber=Long.parseLong(input.nextLine());
				System.out.println("Enter the Email: ");
				String mail=input.nextLine();
				Contact c=new Contact(fname,lname,phonenumber,mail);
				p.addContact(c);
			break;
		case 2:System.out.println("The contacts in the List are:\n"+p.viewAllContacts());
			break;
		case 3:System.out.println("Enter the Phone number to search contact:");
			   long phone=Long.parseLong(input.nextLine());
			   p.viewContactGivenPhone(phone);
			break;
		case 4:System.out.println("Enter the Phone number to remove :");
		   	   long phone=Long.parseLong(input.nextLine());
		   	   System.out.println("Do you want to remove the contact (Y/N):");
		   	   if(input.nextLine()=="Y")
		   		   p.removeContact(phone);
		   	   System.out.println("The contact is successfully deleted.");
			break;
		case 5:exit=false;
			break;
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + x);
		}
	}while(exit==false);
}}
