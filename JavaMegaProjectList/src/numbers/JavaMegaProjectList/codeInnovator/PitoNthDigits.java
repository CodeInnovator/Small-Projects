package numbers.JavaMegaProjectList.codeInnovator;


/**
 * 
 * @author CodeInnovator
 *
 *
 **/

public class PitoNthDigits {

	
	public static void main(String[] args) {
		System.out.println("Up to 5th digits of Pi is " +pitoNthDigits(5));
		System.out.println("Up to 5th digits of e is " + etoNthDigits(5));
		System.out.println("6th fibonacci is " +fibonacci(6));
		
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
	public static  double etoNthDigits(int numb){
		double fold = Math.pow(10, numb);
		double result = Math.floor(Math.E * fold) / fold; 
		return result;
		
	}

/**
 * Fibonacci Sequence - 
 * Enter a number and have the program generate 
 * the Fibonacci sequence to that number or to the Nth number. 
 **/
	public static int fibonacci(int n){
	/** I have option to use either recursion or iteration.
	In order to pick the right algorithm, I need to consider an efficiency
	I think recursion will take more time than iteration.
	Because Recursion will chew up the stack(or we can say calculation repeats redundantly), I will use iteration.
	**/
	int x = 0, y = 1, z = 0;
	for (int i= 0; i < n;i++){
		x = y;
		y = z;
		z = x + y;
	}
	return z;
	}
	
	
}
