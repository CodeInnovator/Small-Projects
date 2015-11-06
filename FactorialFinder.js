//Factorial Finder - 
//The factorial of a positive integer n is defined as the product of the sequence ,
// n-1, n-2, ...1 and the factorial of 0 is defined //as being 1. Solve this using both loops and recursion.`


// Factorial : loop solution
	function factorial(n){
		var result = 1;

		for( i = 0;  i < n; i++){
			result = result * (n - i);
		}
		return result;
	}


// recursion solution

	function factorialr(n){
		if( n === 1){
			return 1;
		} else {
			return n * factorialr(n -1);
		}
	}
	 

	 console.log(factorial(5));// 120	
	 console.log(factorialr(5)); // 120
	 console.log(factorial(12));//479001600
	 console.log(factorialr(12));//479001600
