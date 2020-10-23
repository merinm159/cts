import java.util.Scanner;

public class ValidateUtility {
	public static Validate validateEmployeeName() {
		 Validate valid=v->v.matches("[a-zA-Z\\\\s] {5,20}");
		 return valid;
	}
	 public static Validate validateProductName() 
	    {
	        Validate valid=x->x.matches("[a-zA-Z]{1}[0-9]{5}");
	        return valid;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ename=sc.nextLine();
		String pname=sc.nextLine();
		Validate v=validateEmployeeName();
        Validate vp=validateProductName();
        
        
        if(v.validateName(ename))
            System.out.println("Employee name is valid");
        else
            System.out.println("Employee name is invalid");
        if(vp.validateName(pname))
            System.out.println("Product name is valid");
        else
            System.out.println("Product name is invalid");
	}
}
