package comparableEx;

public class CountXY {
	public static void main(String[] args) {
		System.out.println(prefixAgain("aa", 1));
	}
	public static boolean prefixAgain(String str, int num) {
		boolean flag=false;
		for(int i=1;i<str.length()-num;i++) {
			//System.out.println(str.substring(0, num));
			//System.out.println(str.subSequence(i, i+num));
			if(str.substring(0, num).equals(str.substring(i, i+num)))
			{
				flag=true;
				break;
			}
		}
		return flag;
	}

}
