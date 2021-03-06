package numbers.JavaMegaProjectList.codeInnovator;

import java.util.Scanner;

/**
 * 
 * @author CodeInnovator
 * 
 */

public class DecimalConverter {
	/**
	 * Binary to Decimal and Back Converter - 
	 * 
	 * Develop a converter to convert a decimal number to binary or a binary number to its decimal equivalent.
	 **/	


	public static String decimalConverter(int bin){
		int remainder =bin;
		double counter =1;
		String result = "";
		int temp =(int) (Math.pow(2.0, counter));
		while(remainder / temp > 0){
			counter += 1;
			temp = (int) (Math.pow(2.0, counter));
		}

		while(counter != 0){
			counter -= 1;
			int div = (int) Math.pow(2, counter);
			if(remainder / div > 0){
				result += "1";
				remainder = remainder % div;
			}else{
				result += "0";

			}
		}		
		return result;
	}

	public static void ask(){
		System.out.println("Please provide the decimal number that you want to convert it to binary number: ");
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		int input = Integer.parseInt(answer);
		System.out.println(decimalConverter(input));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
			ask();
	}



}
