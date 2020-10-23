package exmpl;

public class TeachingStaff extends Payment{
	
	@Override
	public float calculatePf(Staff stff) {
		float net=stff.getSalary()-stff.getSalary()*(10/100);
		return net;
	}
	
	
}
