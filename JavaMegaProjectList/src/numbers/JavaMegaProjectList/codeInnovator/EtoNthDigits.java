package numbers.JavaMegaProjectList.codeInnovator;
/**
 * 
 * @author CodeInnovator
 *
 *
 **/
public class EtoNthDigits {

	public static void main(String[] args) {
		System.out.println("Up to 5th digits of e is " + etoNthDigits(5));
	}
	/**	
	 * 
	 * Find e to the Nth Digit - 
	 * Just like the previous problem, 
	 * but with e instead of PI. Enter a number and have the program generate e up to that many decimal places. 
	 * Keep a limit to how far the program will go. 
	 *
	 **/
	public static  double etoNthDigits(int numb){
		double fold = Math.pow(10, numb);
		double result = Math.floor(Math.E * fold) / fold; 
		return result;

	}
}
