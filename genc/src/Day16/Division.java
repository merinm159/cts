package Day16;

import java.util.Scanner;

public class Division {
	public String divideTwoNumbers(int number1,int number2) {
		String s=null;
		try{
			double ans=number1/number2;
			s="The answer is "+ans+" .";
		}catch (ArithmeticException e) {
			s= "Division by zero is not possible.";
		}finally {
			return s+" Thanks for using the application.";
		}
	}
	public static void main(String[] args) {
		Division d= new Division();
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println(d.divideTwoNumbers(num1,num2));

	}
}
