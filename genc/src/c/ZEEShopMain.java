package c;

import java.util.*;

public class ZEEShopMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Members: ");
		int num = sc.nextInt();
		List<Member> memberList = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			System.out.println("Enter the Member Details:");
			String s = sc.next();
			String[] str = s.split(":");
			memberList.add(new Member(str[0], str[1], str[2]));
		}

		System.out.print("Enter the number of times Membership category needs to be searched: ");
		int noOfSearch = sc.nextInt();
		ZEEShop[] zee = new ZEEShop[noOfSearch];

		for (int i = 0; i < noOfSearch; i++) {
			System.out.println("Enter the Category");
			String cat = sc.next();
			zee[i] = new ZEEShop(cat, memberList);
			zee[i].start();

			try {
				zee[i].join();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < noOfSearch; i++) {
			System.out.print(zee[i].getMemberCategory() + ":" + zee[i].getCount() + " ");
		}

	}

}
