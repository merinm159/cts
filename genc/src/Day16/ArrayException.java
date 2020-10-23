package Day16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
	static int[] array;
	Scanner input=new Scanner(System.in);
	public String getPriceDetails() {
		System.out.println("Enter the number of elements in the array");
		int length=Integer.parseInt(input.nextLine());
		System.out.println("Enter the price details");
		try{array=new int[length];
		for (int i = 0; i < array.length; i++) {
		
				array[i]=Integer.parseInt(input.nextLine());
			}} catch (ArrayIndexOutOfBoundsException e) {
				return ("Array index is out of range");
			} catch (InputMismatchException mis) {
				return ("Input was not in the correct format");
			}
			
		
		return null;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayException ae=new ArrayException();
		System.out.println(ae.getPriceDetails());
		System.out.println("Enter the index of the array element you want to access");
		int index=Integer.parseInt(input.nextLine());
		System.out.println("The array element is "+array[index]);
		
	}
}
