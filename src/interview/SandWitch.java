package interview;

import java.util.regex.Pattern;

/*
 * A sandwich is two pieces of bread with something in between. 
 * Return the string that is between the first and last appearance of "bread" in the given string, 
 * or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 */
public class SandWitch {
	public static void main(String[] args) {
//		String str="breaxbreadybread";
//		str=str.replace("xx", "");
//		str=str.replace("yy", "");
//		//System.out.println(str.substring(str.length()-5));
//		str=str.replaceFirst("bread", "");
//		//str=str.replaceFirst(str.substring(str.length()-5), "");
//		//System.out.println(str);
//		str=str.substring(0, (str.length()-5));
//		System.out.println(str);
		
		boolean pat = Pattern.matches("KA[0-9]{2}[A-Z]{2}[0-9]{4}", "KA46HH9236");
		System.out.println(pat);
		System.out.println(Pattern.matches("[789][0-9]{9}", "2310342653"));
	}

}
