/*
 * This is PrizeDistribution class in which admin will enter three id's of the customer
 * Six random id's will be generated by using the rand function 
 * If it matches with id's entered by the admin then  particular user will get the prize 
 */
package utility;
import entity.Customer;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class PrizeDistribution {
	 
	/*
      * method to generate the prize, admin will enter 3 id's
	  * and 6 random id's will be generated by using the rand function and if it
	  * matches with id's entered by the admin then  particular user will get the prize   	
     */
	 final public void generatePrize(ArrayList<Customer> customer)
	 {
		int i;
		System.out.println("Please enter 3 valid customer id");
		ArrayList<Integer> checkId=new ArrayList<Integer>();
		Random random=new Random(); 
		Scanner scanner=new Scanner(System.in);
		int randomnumber=random.nextInt(6);
		int randomid=customer.get(randomnumber).getId();
		for(i=0;i<3;i++)
		{
			checkId.add(scanner.nextInt());
		}
		for(i=0;i<6;i++)
		{
			System.out.println("Random"+randomid);
			int flag=0;
			if(checkId.contains(randomid))
			{
				System.out.println("customer with id:"+randomid+"has won");
				checkId.remove(new Integer(randomid) );
			}
			else {
				flag++;
			}
			if (flag!=0) {
				System.out.println("This was not your day to won, try it better next time");
			}
			randomnumber=random.nextInt(6);
			randomid=customer.get(randomnumber).getId();
		 }
	}
}