//hyundai class will extend the car class
package carpurchase;
public class Hyundai extends Car {
	//variables of hyundai class
	private int carid;
	private String carmodel;
	private int carprice;
	//constructor to instantiate the values
	public Hyundai(int carid,String carmodel,int carprice) {
		super(carid,carmodel,carprice);
		this.carid=carid;
		this.carmodel=carmodel;
		this.carprice=carprice;
		
	}
	//Override method 
	public double calculateResale() {
		resaleprice=0.4*carprice;
		return 0.4*carprice;
		}
	public int getcarId() {
		return carid;
	}
    public String getcarModel() {
    	return carmodel;
    }
    public int getcarPrice() {
    	return carprice;
    }
	
}
