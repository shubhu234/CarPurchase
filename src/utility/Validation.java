/*
 * Validation class to validate the id and name of the customer
 */
package utility;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Validation {
	
	/*
	 * method to validate the id 
	 *@return true if id entered is valid else return id is not valid
	*/
	public static boolean validateId(String id)
	{
		String regex="[+-]?[0-9][0-9]*";
		Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(id);
		return matcher.find();
	}
	
	/*
	 * method to validate the name
	 * @return true if name entered is valid else return false 
	*/
	public static boolean validateName(String name)
	{
		String regex="^[a-zA-Z\\s]+$";
		Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(name);
		return matcher.find();
	}

}
