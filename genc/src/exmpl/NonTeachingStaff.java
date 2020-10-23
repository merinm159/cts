package exmpl;

public class NonTeachingStaff extends Payment {
	@Override
	public float calculatePf(Staff stff) {
		float net=stff.getSalary()-stff.getSalary()*(5/100);
		return net;
	}

}
