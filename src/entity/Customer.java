/*
 * This is a customer class that contains customer id and customer name
 * It contains methods that return customer id and customer name
 * It contains carList method which contains various types of car
*/
package entity;
import java.util.Scanner;
import java.util.ArrayList;
public class Customer {
public Customer() {}

//Scanner object for taking the input from the user
private Scanner scanner=new Scanner(System.in);

//variables of the customer class
private int customerId;
private String customerName;

//ArrayList of the car to take the different types of car
private ArrayList<Car> carlist=new ArrayList<Car>();

/*constructor of the car class
 * @param customerid-id of the customer
 * @param customername-name of the customer 
 */
public Customer(int customerId, String customerName)
{
	this.customerId=customerId;
	this.customerName=customerName;
}

//@return id of the customer 
public int getId() {
	return customerId;
}

//@return name of the customer
public String getName() {
	return customerName;
}

/*
 * @method getCarList to add the car,it will enter details of car and and then it will ask for the car type 
 * in which you want to add the details of the car for a particular customer id 
 */
public void getCarList() {
	System.out.println("Enter the valid car details");
	System.out.println("Enter valid car id");
	int carId=scanner.nextInt();
	System.out.println("Enter valid car model");
	String carModel=scanner.next();
	System.out.println("Enter valid car price");
	int carPrice=scanner.nextInt();
	System.out.println("Enter valid car type in which you want to insert the details");
	System.out.println("Enter 1 for Hyundai");
	System.out.println("Enter 2 for Toyota");
	System.out.println("Enter 3 for Maruti");
	final int carType=scanner.nextInt();
	switch(carType) {
	case 1:
		Car hyundaicar=new Hyundai(carId,carModel,carPrice);
		hyundaicar.calculateResalePrice();
		carlist.add(hyundaicar);
		break;
	case 2:
		Car toyotacar=new Toyota(carId,carModel,carPrice);
		toyotacar.calculateResalePrice();
		carlist.add(toyotacar);
		break;
	case 3:
		Car maruticar=new Maruti(carId,carModel,carPrice);
		maruticar.calculateResalePrice();
		carlist.add(maruticar);
		break;
	default:
			System.out.println("Invalid Input");
	        break;
	}
}

//@method printCarDetails will print all the details of the car 
public void printCarDetails() {
	
for(Car car:carlist) {
	System.out.println("CarId: "+car.getCarId()+" "+
                      "\nCarModel:"+" "+car.getCarModel()+" "+
			          "\nCarPrice:"+" "+car.getCarPrice()+" "+
                      "\nCarResaleprice"+" "+car.calculateResalePrice());
	}
}
}
