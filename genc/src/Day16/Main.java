package Day16;

import java.util.Scanner;

public class Main {
	 public static Candidate getCandidateDetails() {
		 Candidate c =new Candidate();
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the candidate Details");
		 c.setName(input.nextLine());
		 System.out.println("Name");
		 c.setName(input.nextLine());
		 System.out.println("Gender");
		 c.setGender(input.nextLine());
		 System.out.println("Excpected Salary");
		 c.setExpectedSalary(Integer.parseInt(input.nextLine()));
		 return c;
	 }
	 public static void main(String[] args) {
		Candidate c1=new Candidate();
		getCandidateDetails();
		try{if(c1.getExpectedSalary()<1000)
				throw new InvalidSalary("Registration Failed. Salary cannot be less than 10000.");
			else
				System.out.println("Registration Successful");
		    }catch (InvalidSalary e) {
				e.printStackTrace();
			}
	
	}
}
