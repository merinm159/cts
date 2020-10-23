import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Members:");
		int noOfMembers=Integer.parseInt(sc.nextLine());
		List<Member> l=new ArrayList<>();
		for (int i = 0; i < noOfMembers; i++) {
			System.out.println("Enter the Member Details:");
			String[] str=sc.nextLine().split("[:]");
			Member m=new Member(str[0], str[1], str[2]);
			l.add(m);
		}
		System.out.println("Enter the number of times Membership category needs to be searched:");
		int noofSearch=Integer.parseInt(sc.nextLine());
		ZEEShop[] z=new ZEEShop[noofSearch];
		
		for (int i = 0; i < z.length; i++) {
			System.out.println("Enter the Category");
			String category=sc.nextLine();
			z[i]=new ZEEShop(category, l);
			z[i].start();
			try {
				z[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i < z.length; i++) {
			System.out.println(z[i].getMemberCategory()+":"+z[i].getCount());
		}
		
	}
}
