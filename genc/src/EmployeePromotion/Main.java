package EmployeePromotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Employee> l=new ArrayList<>();
		System.out.println("Enter the number of employees");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the employee details");
		for (int i = 0; i < n; i++) {
			
			String[] a1=sc.nextLine().split("[:]");
			Employee e=new Employee(a1[0], a1[1],Double.parseDouble(a1[2]));
			l.add(e);
		}
		System.out.println("Enter the number of times salary limit to be searched");
		int search=Integer.parseInt(sc.nextLine());
		double[] salarylimit=new double[search];

		for (int i = 0; i < search; i++) {
			System.out.println("Enter the salary limit to be searched");
			salarylimit[i]=Double.parseDouble(sc.nextLine());
		}
		for (int i = 0; i < salarylimit.length; i++) {
			Management m= new Management(salarylimit[i], l);
			m.start();
			try {
				m.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
