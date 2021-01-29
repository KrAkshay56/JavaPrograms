package interview;

public class Miror {
	public static void main(String[] args) {
		int[] arr= {7, 1, 2, 9, 7, 2, 1};
		System.out.println(mirror(arr));
	}
	public static int mirror(int[] nums) {
		int len = nums.length;
		  int count= 0;
		  int max = 0;
		  for (int i = 0; i < len; i++){
		    count=0;
		    for (int j = len-1; i + count < len && j > -1; j--){
		      if(nums[i+count] == nums[j]){
		        count++;
		      }
		      else{
		        if (count > 0){
		          max = Math.max(count,max);

		          count = 0;

		        }
		      }
		    }
		    max = Math.max(count,max);
		  }
		  return max;

	}

}
