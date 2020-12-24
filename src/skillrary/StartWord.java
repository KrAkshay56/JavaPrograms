package skillrary;
/*
 * Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
 */
public class StartWord {
	public static void main(String[] args) {
		System.out.println(startWord("hippo", "i"));
	}
	public static String startWord(String str,String word) {
		String newString="";//ip
		for(int i=1;i<word.length();i++) {
			newString=newString+str.charAt(i);
		}
		if(str.contains(newString)) {
			return str.substring(0, word.length());
		}else
		{
			return "";
		}
	
	}

}
