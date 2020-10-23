package insuranc;

import java.util.Map;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

public class UserInterface {
	public static void main(String[] args) {
		Bazaar bazaar= new Bazaar();
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		System.out.println("Enter the no of Policy names you want to store");
		 int n=Integer.parseInt(sc.nextLine());
		 for (int i = 0; i < n; i++) {
	            System.out.println("Enter Policy Id");
	            int id=Integer.parseInt(sc.nextLine());
	            System.out.println("Enter the Policy Name");
	            String name=sc.nextLine();
	            bazaar.addPolicyDetails(id, name);
	        }
		 Map<Integer,String> tot=bazaar.getPolicyMap();
		 tot.forEach((key,value)->System.out.println(key+" "+value));
		 System.out.println("Enter policy type to be searched");
	        List<Integer> searched=bazaar.searchBasedOnPolicyType(sc.nextLine());

	}
}
