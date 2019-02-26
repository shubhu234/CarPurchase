/*
 * This is a car class
 * It is an abstract class
 * @param carid-id of the car 
 * @param carmodel-model of the car
 * @param carprice-price of car
 */
package entity;
abstract public class Car {
	public Car() {}
	
	//variables of car class
	private int carId;
	private String carModel;
	private int carPrice;
    public double resalePrice;
	/*
	 * constructor of car class
	 * @param carid-id of the car
	 * @param carmodel-model of the car
	 * @param carprice-price of the car
	 */
	public Car(int carId,String carModel,int carPrice) {
		this.carId=carId;
		this.carModel=carModel;
	    this.carPrice=carPrice;
	}
	//abstract method calculateResale as every car type has different resale price
	abstract public double calculateResalePrice();

	//@return it will return id of the car 
	public int getCarId() {
		return carId;
	}
	
	//@return it will return model of the car
    public String getCarModel() {
    	return carModel;
    }
    
    //@return it will return price of the car
    public int getCarPrice() {
    	return carPrice;
    }
    
    //@return it will return resaleprice of the car
    public double getResalePrice() {
    	return resalePrice;
    }
 }
