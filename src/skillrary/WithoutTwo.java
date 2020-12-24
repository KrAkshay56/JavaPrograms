package skillrary;
/*
 * Given a string, if a length 2 substring appears at both its beginning and end, 
 * return a string without the substring at the beginning, so "HelloHe" yields "lloHe". 
 * The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.


without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
 */
public class WithoutTwo {
	public static void main(String[] args) {
		System.out.println(without2("HelloH"));
	}
	public static String without2(String word) {
		if(word.length()>0) {
		if(word.substring(0, 2).equals(word.substring(word.length()-2))) {
			return word.substring(2);
		}
		else if(word.substring(0, 2).equals(word)) {
			return "";
		}
		else
		{
			return word;
		}
		}
		else
		{
			return "";
		}
	}

}
