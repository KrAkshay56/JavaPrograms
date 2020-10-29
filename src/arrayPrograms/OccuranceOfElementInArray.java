package arrayPrograms;

public class OccuranceOfElementInArray {
	public static void main(String[] args) {
		
		int arr[] = {10,20,10,30,10,30};
		
		int freq[]=new int[arr.length];
		int visited=-1;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
		
		for(int i=0;i<arr.length-1;i++) {
			if(freq[i]!=visited && arr[i]!=visited ) {
				System.out.println(arr[i] +" occured "+freq[i]);
			}
		}
	}

}
