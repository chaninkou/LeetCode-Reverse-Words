package reverseWord;

public class Main {
	public static void main(String[] args){
		String input = "This is Michael";
		
		ReverseWordsInString output = new ReverseWordsInString();
		
		System.out.println("input: " + input);
		System.out.println("output: " + output.reverseWords(input));
	}
}
