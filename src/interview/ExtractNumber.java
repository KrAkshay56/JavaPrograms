package interview;

public class ExtractNumber {
	public static void main(String[] args) {
		String str="abc12cd456gh1234";
		String num="";
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				num+=str.charAt(i);
			}
			else
			{
				num+=" ";
			}
		}
		int sum=0;
		String[] arr = num.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(isNum(arr[i])) {
				sum+=Integer.parseInt(arr[i]);
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isNum(String str) {
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				flag=true;
				break;
			}
		}
		return flag;
	}

}
