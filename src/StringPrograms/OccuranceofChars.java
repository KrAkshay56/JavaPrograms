package StringPrograms;

public class OccuranceofChars {
	public static void main(String[] args) {
		
		String str="Himalaya";
		
		char[] arr = str.toCharArray();
		
		int freq[] =new int[str.length()];
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]='0';
				}
			}
			if(freq[i]!='0') {
				freq[i]=count;
			}
		}
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!='0' && arr[i]!='0') {
			System.out.println(freq[i]+" ==== "+str.charAt(i));
			
		}
	}

}
}
