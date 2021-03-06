package numbers.JavaMegaProjectList.codeInnovator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author CodeInnovator
 * October.16.2015
 */
public class NextPrimeNumber {
	int currentPrime = 2;
	List<Integer> primeNumbers;



	/*
	 * Next Prime Number -
	 *  Have the program find prime numbers 
	 *  until the user chooses to stop asking for the next one.
	 */

	public NextPrimeNumber(){

	}

	private void nextPrime(){
		if (currentPrime == 2){
			System.out.println("First Prime number is " +currentPrime + ".");
			primeNumbers  = new ArrayList<Integer>();
			primeNumbers.add(2);
			this.currentPrime += 1;
		}else if(isPrime(currentPrime)) {
			primeNumbers.add(currentPrime);
			System.out.println("Next Prime number is " +currentPrime + ".");
		} else {
			currentPrime = currentPrime + 1;
			nextPrime();
		}
	}


	private boolean isPrime(int n){

		for(int i = 0; i < primeNumbers.size(); i++){
			if(n % (primeNumbers.get(i)) == 0){
				return false;
			}
		}
		return true;
	}

	private void answer(){
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		if (answer.contains("YES") || answer.contains("yes") || answer.contains("Yes")){
			this.nextPrime();
			System.out.println("Would you like to know the next Prime Number? answer with either yes or no");
			this.answer();
		} else if(answer.contains("NO") || answer.contains("No") || answer.contains("no")) {
			System.out.println("Okay then. These are the prime numbers that you have explored so far: "
					+ primeNumbers + ". Do you want to start over?");
			NextPrimeNumber result = new NextPrimeNumber();
			result.answer();
		} else {
			System.out.println("Ah-oh, you entered the invalid answer. Do you like to try it again?");
			this.answer();
		}
	}
	public static void main(String[] args) {
		System.out.println("Would you like to know the first Prime Number? answer with either yes or no");
		NextPrimeNumber result = new NextPrimeNumber();
		result.answer();


	}
}
