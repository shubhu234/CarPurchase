//CompareName class to compare and sort it on the basis of name 
package comparator;
import java.util.Comparator;
import entity.Customer;
public class CompareName {
  public Comparator<Customer> comparator=new Comparator<Customer>() 
  {
	     /*
	     * compare method to compare on the basis of name
	     * @return customer name in sorted order
	     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	     */
		 public int compare(Customer customer1, Customer customer2)
		{
			return customer1.getName().compareTo(customer2.getName());
		}
	};

}
