/*
 * Maruti class is a type of car and it extends Car class
 * It overrides the calculateResalePrice method of the Car class
 */
package entity;
public class Maruti extends Car
{
	//maruti class variables
	private int carId;
	private String carModel;
	private int carPrice;
	
	/*
	 * constructor of Hyundai class
	 * @param carId-id of the car
	 * @param carModel-model of the car
	 * @param carPrice-price of the car 
	 */
	public Maruti(int carId,String carModel,int carPrice) {
		super(carId,carModel,carPrice);
		this.carId=carId;
		this.carModel=carModel;
		this.carPrice=carPrice;
	}
	
	@Override  
	public double calculateResalePrice() {
		resalePrice=0.6*carPrice;
		return 0.6*carPrice;
	}
	public int getCarId() {
		return carId;
	}
    public String getCarModel() {
    	return carModel;
    }
    public int getcarPrice() {
    	return carPrice;
    }
}
