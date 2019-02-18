
/* This is an Admin class
 * It will provide all the functionalties for car purchase system like
 * add new customer,add car to the customer, list the customer by name,
 * list the individual customer based on the id,generate the prize
 */
package carpurchase;
import java.util.Scanner;
public class Admin extends CarUtility {
	public static void main(String args[]) {
		
		//scanner for taking the input from the user
		Scanner scanner = new Scanner(System.in);
		//utilty for accessing the CarUtility calss methods
		CarUtility utility=new CarUtility();
	//admin will enter the choice for the various types of operations	
	int choice;
	int value=0;
	do{
		System.out.println("Welcome to the Car Purchase System\n"+""
	                       +"1. Add new customer\n"+""
	                       +"2. Add  car to an existing customer\n"+""
	                       +"3. List all customers (sorted by name)\n"+""
	                       +"4. List individual customer based on the Id\n"+""
				           +"5. Generate the Prize");
		System.out.println("Enter your preference:");
		choice=scanner.nextInt();
		switch(choice) {
		
		//Adding new customer
		case 1:
			utility.addCustomer();
			break;
			
		//Add car to an existing customer
		case 2:
			utility.addCar(); 
			break;
			
	    //List all customers(sorted by name)	
		case 3:
			utility.listCustomers();
			break;
			
	    //List individual customer based on the id		
		case 4:
			utility.listCustomersOnId();
			break;
			
		 //Generating the prize
		 case 5:
			utility.generatePrize();
			break;
		default:
				System.out.print("Invalid choice");
				break;
		}
		
		
		System.out.print("\n Do you want to continue...\n Y for Yes \n E for Exit\n");
		char value1=scanner.next().charAt(0);
		if(value1 =='Y' || value1 == 'y')
		{
			value=1;
		}
		else if(value1=='E'|| value1=='e')
		{
			value=0;
		}
		
	}while(value>0);
}
}

