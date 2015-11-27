
//Collatz Conjecture - Start with a number n > 1. 
//Find the number of steps it takes to reach one using the following process:
// If n is even, divide it by 2. If n is odd, multiply it by 3 and add 1.

function collatz_conjecture(n){
	collatz(n, 0);
}
function collatz(n , a){
	//1. If n = 1, return Count;
	//else 
	//2.identify wether its even or odd.
		//a. if n is even, divide it by 2-> then repeat.
		//b. if n is odd, multiply it by 3 and add 1 -> repeat.

	if( n === 1) {
		console.log(a);
	} else if(isOdd(n)){
		var temp = n * 3 + 1;
		//console.log(a);
		collatz(temp, a + 1);
	} else {
		var temp = (n / 2) ;
		//console.log(a);
		collatz(temp, a + 1);
		
	}
}


function isOdd(n){
	return n%2;
}


//3 -> 10 ->5 ->16 ->8 -> 4 -> 2->1 