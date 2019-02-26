/*
 * This is an CarUtility class which contains all the functionalities and various methods
 * Admin class in the controller package takes all the access from the CarUtility class 
 */
package utility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import comparator.CompareName;

import comparator.CompareName;
import entity.Customer;

import java.util.Comparator;
public class CarUtility {
	        //an arraylist for the customer 
			ArrayList<Customer> customer=new ArrayList<Customer>();
			
	       //scanner for taking the input from the user
			Scanner scanner = new Scanner(System.in);
			
			//@method to add the customer giving the cutomer id and customer name
			public void addCustomer()
			{
				String id ;
				String name = null;
				System.out.println("Enter the id of the customer");
			    id=scanner.next();
			    if(!Validation.validateId(id))
				{
			    	System.out.print("Entered id is not valid");
			    	return;
			    }
			    System.out.println("\nEnter the name of the customer");
				name=scanner.next();
				 if(!Validation.validateName(name))
					{
				    	System.out.print("Entered name is not valid");
				    	return;
				    }
				customer.add(new Customer(Integer.parseInt(id),name));
				System.out.println("Customer added");
			}
			
			/*
			 * @method to add the car for a particular customer
			 * It will ask for the id of the customer in which you want to add the car
			 * If id is found then it will ask for the details of the car
			 * If the id is not found control comes out of the if loop as no customer exits of a particular id
			 */
			public void addCar()
			{
				int id;
				System.out.println("Enter the customer id to add cars:");
				 id=scanner.nextInt();
				 for(Customer customer3 : customer) {
					 if(customer3.getId()==id) {
						System.out.println("Customer found"+" "+
					                       "\nId"+" "+customer3.getId()+" "+
								           "\nName"+" "+customer3.getName());
						customer3.getCarList();
						break;
							}
				 }	 
			 }
			
			//@method to list the customers sorted by the name, it uses comparator which has compare method to sort names 
			public void listCustomers()
			{
				int i;
				Collections.sort(customer, (new CompareName().comparator));
				for(i=0;i<customer.size();i++)
				{
					System.out.println("Id"+" "+customer.get(i).getId()+" "+"Name"+" "+customer.get(i).getName());
				}
			}
			
			/*
			 * @method to list the customers based on the individual id
			 *  It will search for the id in the Customer arraylist
			 *  If it finds the id, it will display the details of the customer including the car details of customer
			 *  If the id is not found the control comes out from the if loop as there is no customer of such id   
			 */
			public void listCustomersOnId()
			{
				System.out.println("Enter the id for the customer to search");
				final int search=scanner.nextInt();
				for(Customer customer4 :customer) {
				if(customer4.getId()==search) {
					System.out.println("Customer found:\n"+""
				                        +"Id"+" "+customer4.getId()+" "
							            +"\nName"+" "+customer4.getName());
					customer4.printCarDetails();
					break;
					}
			  }
			}
			
			//@method to generate the Prize for the customer
			//In order to execute the method correctly there should be minimum six customers should be added
			public void generatePrize()
			{
					PrizeDistribution prize=new PrizeDistribution();
					prize.generatePrize(customer);
			}

}

