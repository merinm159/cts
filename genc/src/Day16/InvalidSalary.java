package Day16;

public class InvalidSalary extends Exception {
	public InvalidSalary(String e) {
		super(e);
		System.out.println(getMessage());
	}
	
}
