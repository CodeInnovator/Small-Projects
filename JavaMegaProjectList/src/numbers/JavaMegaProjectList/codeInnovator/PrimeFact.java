package numbers.JavaMegaProjectList.codeInnovator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author CodeInnovator
 *
 *
 **/
public class PrimeFact {

	public static void main(String[] args) {
		/**
		 * Prime Factorization
		 *  Have the user enter a number and find all Prime Factors (if there are any) 
		 *  and display them.
		 **/
		//Example Results for 48, 128, 13.
		System.out.println(primeFact(48));
		System.out.println(primeFact(128));
		System.out.println(primeFact(13));
	}

	public static List<Integer> primeFact(int n){
		int max = n;
		ArrayList<Integer> primeNumber = new ArrayList<Integer>();

		for(int i = 1; i <= n; i++){
			if(max % i == 0){
				if(primeNumber.contains(i)){
				} else{
					primeNumber.add(i);
					//Maybe I can add  (Given Number n)/i to the result at this point in oder to improve the performance But result array won't be organized. So I decided not to use.
				}
			}
		}
		return primeNumber;
	}
}