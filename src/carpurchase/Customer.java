/*This is an customer class

 * @param customerid,customername
 */

package carpurchase;
import java.util.Scanner;
import java.util.ArrayList;

public class Customer {
public Customer() {}
private Scanner scanner=new Scanner(System.in);
//variables of the customer class
private int customerid;
private String customername;
//ArrayList of the car to take the different types of car
private ArrayList<Car> carlist=new ArrayList<Car>();
//constructor of the car class 
public Customer(int customerid, String customername)
{
	this.customerid=customerid;
	this.customername=customername;
}
//methods to get the values of the customer 
public int getId() {
	return customerid;
}
public String getName() {
	return customername;
}
/*method to add the car,it will enter details of car and and the it will ask for the car type 
 * in which you want to add the details of the car 
 */
public void getCarlist() {
 
	
	System.out.println("Enter car details");
	
	System.out.println("Enter valid car id");
	int carid=scanner.nextInt();
	System.out.println("Enter valid car model");
	String carmodel=scanner.next();
	System.out.println("Enter valid car price");
	int carprice=scanner.nextInt();
	System.out.println("Enter valid car type in which you want to insert the details");
	System.out.println("Enter 1 for Hyundai");
	System.out.println("Enter 2 for Toyota");
	System.out.println("Enter 3 for Maruti");
	int cartype=scanner.nextInt();
	switch(cartype) {
	case 1:
		Car hyundaicar=new Hyundai(carid,carmodel,carprice);
		hyundaicar.calculateResale();
		carlist.add(hyundaicar);
		break;
	case 2:
		Car toyotacar=new Toyota(carid,carmodel,carprice);
		toyotacar.calculateResale();
		carlist.add(toyotacar);
		break;
	case 3:
		Car maruticar=new Maruti(carid,carmodel,carprice);
		maruticar.calculateResale();
		carlist.add(maruticar);
		break;
	default:
			System.out.println("Invalid Input");
	
	
}

}
public void printCarDetails() {
	// TODO Auto-generated method stub
	
for(Car car:carlist) {
	System.out.println("CarId: "+car.getcarId()+" "+
                      "\nCarModel:"+" "+car.getcarModel()+" "+
			          "\nCarPrice:"+" "+car.getcarPrice()+" "+
                      "\nCarResaleprice"+" "+car.calculateResale());
}
}
}
