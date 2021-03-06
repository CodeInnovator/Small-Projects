package numbers.JavaMegaProjectList.codeInnovator;
/**
 * 
 * @author CodeInnovator
 *
 *
 **/
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("6th fibonacci is " +fibonacci(6));	
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
