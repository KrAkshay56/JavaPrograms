package comparableEx;

public class Ghappy {
	public static void main(String[] args) {
		System.out.println(gHappy("xxggxxg"));
	}
	public static boolean gHappy(String str) {
		boolean flag=false;
		if(str.equals("")) {
			flag=true;
		}
		for(int i=0;i<str.length()-1;i++) {
			 if(str.charAt(i)=='g' && str.charAt(i+1)=='g') {
				flag=true;
			}
			 else if(str.charAt(str.length()-1)=='g' && str.charAt(str.length()-2)!='g') {
				 flag=false;
			 }
			
		}
		return flag;
	}

}
