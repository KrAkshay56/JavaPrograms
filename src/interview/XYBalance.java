package interview;
/*
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
 * there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. 
 * One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.


xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */
public class XYBalance {
	public static void main(String[] args) {
		System.out.println(xyBalance("aaxbby"));
		System.out.println(xyBalance("aaxbb"));
		System.out.println(xyBalance("yaaxbb"));
		System.out.println(xyBalance("xaxxbbyx"));
		System.out.println(xyBalance("bbb"));
	}
	
	public static boolean xyBalance(String str) {
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='x') {
				for(int j=i+1;j<str.length()-1;j++) {
					if(str.charAt(j)=='y' && str.charAt(j+1)=='x') {
						flag=false;
						break;
					}
					else
					{
						flag= true;
						break;
					}
				}
			}
			
		}
		
		return flag;
	}

}
