package numbers.JavaMegaProjectList.codeInnovator;
public class ChangeReturn {
	/**
	 * 
	 * @author CodeInnovator
	 * Date: Oct. 20. 2015.
	 */

	/**
	 * Change Return Program - The user enters a cost and then the amount of money given. 
	 * The program will figure out the change and the number of quarters, dimes, nickels, pennies needed for the change.
	 * @throws NonNegativeException 
	 * 
	 */


	/** Very Important: Because floats and doubles cannot accurately represent the base 10 multiples, the problem cannot be solved by using floats and double. Instead I'm going to use int 
	 * So the input will have a restriction: Do not use decimal. For example, $ 10.25 should be 1025 instead.
	 */

	public static String changeReturn(int amountPaid, int totalPrice) throws NonNegativeException  {
		int changeAmount = amountPaid - totalPrice;
		int quaters, dimes, nickels, pennies;
		if (changeAmount < 0){
			throw new NonNegativeException();
		} else {
			quaters = changeAmount / 25;
			changeAmount = changeAmount % 25;
			dimes = changeAmount / 10;
			changeAmount = changeAmount % 10;
			nickels = changeAmount / 5;
			pennies = changeAmount % 5;

			return "$.25 * " + quaters + ",$.10 * " + dimes + ", $0.05 * " + nickels + ", $.01 * " + pennies;
		}
	}






	public static void main(String[] args) throws NonNegativeException {
		// TODO Auto-generated method stub
		System.out.println(changeReturn(1050, 1022));
		System.out.println(changeReturn(1079, 1022));

	}

}
