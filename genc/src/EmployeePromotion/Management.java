package EmployeePromotion;


import java.util.List;

public class Management extends Thread{

	private double salaryLimit;
	private List<Employee> employeeList;
	private int count;
	public double getSalaryLimit() {
		return salaryLimit;
	}
	public void setSalaryLimit(double salaryLimit) {
		this.salaryLimit = salaryLimit;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Management(double salaryLimit, List<Employee> employeeList) {
		super();
		this.salaryLimit = salaryLimit;
		this.employeeList = employeeList;
	}
    
	public void run() {
		int counttemp=0;
		for (Employee employee : employeeList) {
			if (employee.getEmpSalary()>=this.salaryLimit) 
				++counttemp;
		}
		this.count=counttemp;
		System.out.println(this.salaryLimit+" : "+this.count);
		
	}
}
