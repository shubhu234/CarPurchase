//Toyota class will extend the car class
package carpurchase;
public class Toyota extends Car 
{
	//toyota class variables
	private int carid;
	private String carmodel;
	private int carprice;
	//constructor of toyota class
	public Toyota(int carid,String carmodel,int carprice) {
		super(carid,carmodel,carprice);
		this.carid=carid;
		this.carmodel=carmodel;
		this.carprice=carprice;
	}
	//Override method  
	public double calculateResale()
	{
		resaleprice=0.8*carprice;
		return 0.8*carprice;
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