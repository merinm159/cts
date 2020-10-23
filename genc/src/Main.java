import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

public class Main {
	
	private static Map <String,Double> employeeMap= new HashMap<String,Double>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		employeeMap.put(employeeName,salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{//	ArrayList<String> list = new ArrayList<String>();
//		list=employeeMap.entrySet().stream().filter(e->e.getValue==salary) .collect(Collectors.toList(e->getValue));
		EmployeeAudit a=(salary)->
		{	ArrayList<String> list = new ArrayList<String>();
		     for(Entry<String, Double> val:employeeMap.entrySet()) 
		     {
		    	 
		    	if(val.getValue()==salary)
		    	{
		    		list.add(val.getKey());
		    	}
		     }
		     return list;
		};
		//return a;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int option;
		double search=0;
		Main m = new Main();
		do {
			System.out.println("1.Add Employee Details\n2.Find Employee Details\n3.Exit");
			option=sc.nextInt();
			
			switch (option)
			{
			case 1:
				sc.nextLine();
				System.out.println(" Enter the Employee name");
				String name=sc.nextLine();
				System.out.println("Enter the Employee Salary");
				double sal=sc.nextDouble();
				m.addEmployeeDetails(name,sal);
				break;
			case 2:
				System.out.println("Enter the salary to be searched");
				search=sc.nextDouble();
				EmployeeAudit a=findEmployee();
				ArrayList<String> list=a.fetchEmployeeDetails(search);
				list.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Let's complete the session");
				break;
			
			}

		}while(option!=3);

			System.exit(0);
		
	}

}