import java.util.Scanner;

public class UserInterface {
    
   public static void main(String args[]) {
        
    // Fill the code here
	   Scanner input= new Scanner(System.in);
	   System.out.println("Enter the no of passengers");
	   int size=Integer.parseInt(input.nextLine());
	   double totamt=0;
	   Ticket t[]=new Ticket[size];
	   for (int i = 0; i < t.length; i++) {
		   System.out.println("Details of Passenger "+i+1);
		   System.out.println("Enter the pnr no:");
		   long pnr=Long.parseLong(input.nextLine());
		   System.out.println("Enter passenger name:");
		   String passengerName=input.nextLine();
		   System.out.println("Enter seat no:");
		   int seatNo=Integer.parseInt(input.nextLine());
		   System.out.println("Enter class type:");
		   String classType=input.nextLine();
		   System.out.println("Enter ticket fare:");
		   double ticketFare=Double.parseDouble(input.nextLine());
		   t[i]=new Ticket(pnr,passengerName,seatNo,classType,ticketFare);
		   CommissionInfo c=generateCommissionObtained();
		   totamt =totamt + c.calculateCommissionAmount(t[i]);
	}
    
    }
   public static CommissionInfo generateCommissionObtained() {
	  CommissionInfo cinfo=c->{
		  double amt=0;
		  if (c.getClassType()=="SL" || c.getClassType()=="2S") 
			  amt=60;
		  else if(c.getClassType()=="1A" || c.getClassType()=="2A" || c.getClassType()=="3A")
			  amt=100;
		  return amt;
		};
		return cinfo;
	  
   }
}   
