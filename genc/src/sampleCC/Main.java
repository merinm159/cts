package sampleCC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the product id: ");
		long productId=Long.parseLong(input.nextLine());
		System.out.println("Enter the qty on hand: ");
		int qtyOnHand=Integer.parseInt(input.nextLine());
		Product p=new Product(productId, qtyOnHand);
		
		
		System.out.println("Enter the qty to be purchase: ");
		int qtyToPurchase=Integer.parseInt(input.nextLine());
		
		System.out.println("Enter the qty to be sales: ");
		int qtyToSale=Integer.parseInt(input.nextLine());
		
		p.qtyOnHand=(p.qtyOnHand )+ qtyToPurchase-qtyToSale;
		System.out.println("Qty On Hand: "+p.qtyOnHand);
		
	}

}
