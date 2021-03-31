public class Strings{
	
	public static String reverse(String word){
		if(word.length() == 0){
			return word;
		}
		return word.charAt(word.length()-1) + reverse(word.substring(0,word.length()-1));
	}
	
	public static boolean isPalindrome(String word){
		if(word.length() < 2) return true;
		if(word.substring(0,1).equals(word.substring(word.length()-1,word.length()))){
			//System.out.println("output: method call");
			return isPalindrome(word.substring(1,word.length()-1));
		}
		return false;
	}
}