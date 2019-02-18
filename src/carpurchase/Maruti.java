//maruti class extends the car class 
package carpurchase;
public class Maruti extends Car
{
	//maruti class variables
	private int carid;
	private String carmodel;
	private int carprice;
	//constructor of maruti class
	public Maruti(int carid,String carmodel,int carprice) {
		super(carid,carmodel,carprice);
		this.carid=carid;
		this.carmodel=carmodel;
		this.carprice=carprice;
	}
	//override method 
	public double calculateResale() {
		resaleprice=0.6*carprice;
		return 0.6*carprice;
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
