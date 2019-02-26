/*
 * Hyundai class is a type of car and it extends Car class
 * It overrides the calculateResalePrice method of the Car class
 */
package entity;
public class Toyota extends Car 
{
	//toyota class variables
	private int carId;
	private String carModel;
	private int carPrice;
	
	/*
	 * constructor of Hyundai class
	 * @param carId-id of the car
	 * @param carModel-model of the car
	 * @param carPrice-price of the car 
	 */
	public Toyota(int carId,String carModel,int carPrice) {
		super(carId,carModel,carPrice);
		this.carId=carId;
		this.carModel=carModel;
		this.carPrice=carPrice;
	}
	
	@Override  
	public double calculateResalePrice()
	{
		resalePrice=0.8*carPrice;
		return 0.8*carPrice;
    }
	public int getCarId() {
		return carId;
	}
    public String getCarModel() {
    	return carModel;
    }
    public int getCarPrice() {
    	return carPrice;
    }
}