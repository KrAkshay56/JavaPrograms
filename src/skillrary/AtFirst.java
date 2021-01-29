package skillrary;
/*
 * Given a string, return a string length 2 made of its first 2 chars. 
 * If the string length is less than 2, use '@' for the missing chars.


atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
atFirst("") → "@@"
 */
public class AtFirst {
	public static void main(String[] args) {
		System.out.println(atFirst("hello"));
		System.out.println(atFirst("hi"));
		System.out.println(atFirst("h"));
		System.out.println(atFirst(""));
	}
	public static String atFirst(String text) {
		if(text.length()<1) {
			return "@@";
		}
		else if(text.length()<2) {
			return text+"@";
		}
		else
		{
			return text.substring(0, 2);
		}
	}

}
