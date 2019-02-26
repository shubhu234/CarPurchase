/*
 * Hyundai class is a type of car and it extends Car class
 * It overrides the calculateResalePrice method of the Car class
 */
package entity;
public class Hyundai extends Car {
	
	//variables of hyundai class
	private int carId;
	private String carModel;
	private int carPrice;
	
	/*
	 * constructor of Hyundai class
	 * @param carId-id of the car
	 * @param carModel-model of the car
	 * @param carPrice-price of the car 
	 */
	public Hyundai(int carId,String carModel,int carPrice) {
		super(carId,carModel,carPrice);
		this.carId=carId;
		this.carModel=carModel;
		this.carPrice=carPrice;
	}
	
	@Override 
	public double calculateResalePrice() {
		resalePrice=0.4*carPrice;
		return 0.4*carPrice;
		}
	public int getcarId() {
		return carId;
	}
    public String getcarModel() {
    	return carModel;
    }
    public int getcarPrice() {
    	return carPrice;
    }
}
