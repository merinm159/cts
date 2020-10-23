import java.util.Scanner;

public class SnacksDetails {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the no of pizzas bought:");
	int pizza=input.nextInt();
	System.out.println("Enter the no of puffs bought:");
	int puffs=input.nextInt();
	System.out.println("Enter the no of drinks bought:");
	int drinks=input.nextInt();
	int tot=(pizza*100)+(puffs*20)+(drinks*10);
			System.out.println("Bill Details\nNo of pizzas:"+pizza+"\nNo of puffs:"+puffs+"\nNo of cooldrinks:"+drinks+"\nTotal price="+tot+"\nENJOY THE SHOW!!!");
}
}
