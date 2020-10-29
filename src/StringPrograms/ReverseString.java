package StringPrograms;

public class ReverseString {
	//Write a program to reverse first half separately and 2nd half separately?
public static void main(String[] args) {
	

	String str="himalaya";
	String first = str.substring(0, str.length()/2);
	String second=str.substring(str.length()/2);
	
//	System.out.println(first);
//	System.out.println(second);
	
	String rev1="";
	for(int i=first.length()-1;i>=0;i--) {
		rev1=rev1+first.charAt(i);
	}
	System.out.println(rev1);
	
	String rev2="";
	for(int i=second.length()-1;i>=0;i--) {
		rev2=rev2+second.charAt(i);
	}
	System.out.println(rev2);
}
}
