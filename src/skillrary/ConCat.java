package skillrary;
/*
 * Given two strings, append them together (known as "concatenation") and return the result. 
 * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" 
 * and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 */
public class ConCat {
	public static void main(String[] args) {
		System.out.println(conCat("abc", "cat"));
	}
	
	public static String conCat(String word1,String word2) {
		if(word2.length()==0 || word1.length()==0) {
			return word1+word2;
		}
		else if(word1.charAt(word1.length()-1)==(word2.charAt(0))) {
			word2=word2.replace(word2.charAt(0), ' ');
		}
		word2=word2.trim();
		return (word1+word2);
	}
	

}
