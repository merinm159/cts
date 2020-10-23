package exmpl;

public abstract class Payment {
	abstract public float calculatePf(Staff stff);
	public void display(Staff s) {
		System.out.println("Net Salary: ");
	}
}
