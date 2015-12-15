package numbers.JavaMegaProjectList.codeInnovator;

public class FizzBuzz {
/**
 * 
 * @param args
 * 
 * Fizz Buzz - Write a program that prints the numbers from 1 to 100.
 *  But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
 *  For numbers which are multiples of both three and five print “FizzBuzz”.
 */
	int init = 1;
	int finNum = 100;
	
	
	public static void main(String[] args){
		FizzBuzz result = new FizzBuzz();
		result.run();
	}
	
	public FizzBuzz(){
		
	}
	
	public void run(){
		for(int i = 1; i<= 100; i++){
			if( i % 3 == 0 && i % 5 == 0 ){
				System.out.println("FizzBuzz ");
			} else if( i % 3 == 0){
				System.out.println("Fizz ");
			} else if(i % 5 == 0){
				System.out.println("Buzz ");
			} else {
				System.out.println(i);
			}
		}
	}
}
