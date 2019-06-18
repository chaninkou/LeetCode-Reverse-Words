package reverseWord;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        
        String[] word = s.split(" ");
        
        for(int i = 0; i < word.length; i++){
            word[i] = new StringBuilder(word[i]).reverse().toString();
        }
        
        for(String str : word){
            result.append(str + " ");
        }
        
        return result.toString().trim();
    }
}
