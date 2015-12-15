package numbers.JavaMegaProjectList.codeInnovator;

public class PigLatin {
/**
 * Pig Latin - Pig Latin is a game of alterations played on the English language game. To create the Pig Latin form of an English word the initial consonant sound is transposed to the end of the word and an ay is affixed (Ex.: "banana" would yield anana-bay).
 *  Read Wikipedia for more information on rules.
 * @param args
 */
	String input;
	int length;
	int conCounter = 0;
	final char[] upperConsonant = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','X','Z','W','Y'};
	final char[] lowerConsonant = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','x','z','w','y'};
	char[] continues;
	
	
		//Rules
	//1.For words that begin with consonant sounds,
	//all letters before the initial vowel are placed at the end of the word sequence. Then, "ay" is added.
	//2.For words which begin with vowel sounds or silent letter, one just adds "yay" to the end
	
	public PigLatin(String input){
		this.input = input;
		this.length = input.length();
		this.continues = new char[length];
	}
	
	public boolean printResult(){
		boolean consonant = true;
		int index = 0;
		while(consonant){
			consonant = false;
		for(int i = 0; i<upperConsonant.length; i++){
			if(input.charAt(index) == upperConsonant[i]){
				continues[index] = upperConsonant[i];
				this.conCounter++;
				consonant = true;
				index++;
				break;
			}else if(input.charAt(index) == lowerConsonant[i]){
				continues[index] = lowerConsonant[i];
				this.conCounter++;
				consonant = true;
				index++;
				break;
			}
		}
	}
		if (this.conCounter == 0){
			int newLength = length +3;
			char[] result = new char[newLength];
			for(int i = 0; i<length;i++){
				result[i] = input.charAt(i);
			}
			result[length]= 'y';
			result[length+1] ='a';
			result[length+2] = 'y';
			System.out.println(result);
			return true;
		}
		
		int newLength =  length + 2;
		int rest = length - conCounter;
		char[] result = new char[newLength];
		int j = 0;
		for(int i = conCounter; i<length; i++){
			result[j] = input.charAt(i);
			j++;
		}
		int x = 0;
		for(int i = rest; i<length; i++){
			result[i] = continues[x];
			x++;
		}
		result[newLength -2] = 'a';
		result[newLength -1] = 'y';
		
		System.out.println(result);
		return true;
		
	}
	

	public static void main(String[] args) {

		PigLatin test1 = new PigLatin("pig");
		PigLatin test2 = new PigLatin("banana");
		PigLatin test3 = new PigLatin("trash");
		PigLatin test4 = new PigLatin("happy");
		PigLatin test5 = new PigLatin("eat");
		PigLatin test6 = new PigLatin("omelet");
		

		test1.printResult();
		test2.printResult();
		test3.printResult();
		test4.printResult();
		test5.printResult();
		test6.printResult();

	}


}
