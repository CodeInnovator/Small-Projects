package numbers.JavaMegaProjectList.codeInnovator;


/**
 * 
 * @author CodeInnovator
 *
 *
 **/

public class PitoNthDigits {

	
	public static void main(String[] args) {
		System.out.println(pitoNthDigits(5));
		System.out.println(etoNthDigits(5));
		
	}

/**
 * 
 * Find PI to the Nth Digit - 
 *	Enter a number and have the program generate PI up to that many decimal places.
 *  Keep a limit to how far the program will go. 
 *  
 **/	
	
	public static double pitoNthDigits(int numb){
		double fold = Math.pow(10, numb);
		double result = Math.floor(Math.PI * fold) / fold; 
		return result;
		
	}
	
/**	
 * 
 * Find e to the Nth Digit - 
 * Just like the previous problem, 
 * but with e instead of PI. Enter a number and have the program generate e up to that many decimal places. 
 * Keep a limit to how far the program will go. 
 *
 **/
	public static double etoNthDigits(int numb){
		double fold = Math.pow(10, numb);
		double result = Math.floor(Math.E * fold) / fold; 
		return result;
		
	}
	
}
