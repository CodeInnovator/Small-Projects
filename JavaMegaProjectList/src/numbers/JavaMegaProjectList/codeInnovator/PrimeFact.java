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
		//Example Results for 1, 5, 64, 128, 13, 133
		System.out.println(primeFact(1));
		System.out.println(primeFact(5));
		System.out.println(primeFact(64));
		System.out.println(primeFact(128));
		System.out.println(primeFact(13));
		System.out.println(primeFact(133));
	}

	public static List<Integer> primeFact(int n){
		int max = n;
		ArrayList<Integer> candidates = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++){
			if(max % i == 0){
				if(!candidates.contains(i)){
					if (isPrime(i, candidates)){
						candidates.add(i);
					}
				}
			}
		}
		return candidates;
	}

	private static boolean isPrime(int n, ArrayList<Integer> candidates) {
		if(candidates.size() == 0 && n == 1){
			return false;
		} else {
		for(int i = 0; i< candidates.size(); i++){
				if(n % (candidates.get(i)) == 0){
					return false;
				}
			}
			return true;
	}
	}
}
