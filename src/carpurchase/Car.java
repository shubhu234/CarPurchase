/*This is a car class
 * It is an abstract class
 * @param carid,carmodel,carprice
 */
package carpurchase;
abstract public class Car {
	public Car() {}
	//variables of car class
	private int carid;
	private String carmodel;
	private int carprice;
    public double resaleprice;
	//constructor of car class to instantiate the values
	public Car(int carid,String carmodel,int carprice) {
		this.carid=carid;
		this.carmodel=carmodel;
	    this.carprice=carprice;
	}
	//abstract method as every car type has different resale price
	abstract public double calculateResale();
	//getter methods to take the values  
	public int getcarId() {
		return carid;
	}
    public String getcarModel() {
    	return carmodel;
    }
    public int getcarPrice() {
    	return carprice;
    }
    public double getResale() {
    	return resaleprice;
    }
 }
