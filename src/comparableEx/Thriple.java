package comparableEx;

public class Thriple {
	public static void main(String[] args) {
		System.out.println(countTriple("222abyyycdXXX"));
	}
	public static int countTriple(String str) {
		int count=0;
		for(int i=0;i<str.length()-2;i++) {
			String word = str.substring(i, i+3);
			if(word.equals(""+str.charAt(i)+str.charAt(i)+str.charAt(i))) {
				count++;
			}
		}
		return count;
		
	}

}
