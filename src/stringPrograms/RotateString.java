package stringPrograms;

public class RotateString {
	public static void main(String[] args) {
		String str="Java is a programming language";
		String[] arr=str.split(" ");
		int rotation=3;
		for(int i=0;i<rotation;i++) {
			String word=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=word;
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}
	
	//public static String rotateString(Str)

}
