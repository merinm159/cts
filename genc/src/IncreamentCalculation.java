import java.util.Scanner;

import jdk.internal.icu.impl.Norm2AllModes.NoopNormalizer2;

public class IncreamentCalculation {
	public static void main(String[] args) {
		float tickectCost;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no of tickets:");
		int nooftickets=Integer.parseInt(input.nextLine());
		if (nooftickets<5 || nooftickets>40) {
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		}
		else {
		System.out.println("Do you want any refreshments:");
		char refreshments=input.next().charAt(0);
		System.out.println("Do you have coupon code:");
		char coupon=input.next().charAt(0);
	    System.out.println("Enter the circle:");
	    char circle=input.next().charAt(0);
		if (circle=='k') {
			tickectCost=nooftickets*75;
			if(nooftickets>20) {
					tickectCost=tickectCost-(tickectCost*10/100);
				}
			else
				tickectCost=tickectCost;
			if(coupon=='y')
				tickectCost=tickectCost-(tickectCost*2/100);
			else if (coupon=='n') {
				tickectCost=tickectCost;
			}
			else
				System.out.println("Invalid Input");
			if(refreshments=='y')
				tickectCost=tickectCost+50*nooftickets;
			else if (refreshments=='n') {
				tickectCost=tickectCost;
			}
			else
				System.out.println("Invalid Input");
			System.out.printf("Total cost:"+"%.2f\n",tickectCost);
		}
		if (circle=='q') {
			tickectCost=nooftickets*150;
			if(nooftickets>20) {
					tickectCost=tickectCost-(tickectCost*10/100);
				}
			else
				tickectCost=tickectCost;
			if(coupon=='y')
				tickectCost=tickectCost-(tickectCost*2/100);
			else if (coupon=='n') {
				tickectCost=tickectCost;
			}
			else
				System.out.println("Invalid Input");
			if(refreshments=='y')
				tickectCost=tickectCost+50*nooftickets;
			else if (refreshments=='n') {
				tickectCost=tickectCost;
			}
			else
				System.out.println("Invalid Input");
			System.out.printf("Total cost:"+"%.2f\n",tickectCost);
		}
		
		else
			System.out.println("Invalid Input");
		}
	
			
	}
}
