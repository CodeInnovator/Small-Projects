package numbers.JavaMegaProjectList.codeInnovator;

public class Reverse {
/**
 * Reverse a String - Enter a string and the program will reverse it and print it out.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Reverse result = new Reverse();
			result.result("abcde");
	}
	
	public Reverse(){
		
	}

	public void result(String input){
		//"abcd" -> "cdba" 
		int length = input.length();
		char[] temp = new char[length];
		int index = 0;
		for(int i = length; i >0; i--){
		temp[index]= input.charAt(i - 1);
		index++;
		}
		System.out.println(temp);
		
	}
}
