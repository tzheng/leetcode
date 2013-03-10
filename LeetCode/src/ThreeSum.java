import java.util.ArrayList;
import java.util.Arrays;


public class ThreeSum {
	
	//solution ,take one number out, and solve like two sum.   0 = -1 + 0 + 1, take -1 out, 1 = 0 + 1;
	public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (num.length < 3) return result;
		
		Arrays.sort(num);
		for (int i =0; i < num.length - 2; i++) {
			//avoid duplicates
			for (int j = i+1, k = num.length-1; j<k;) {
				int sum = num[i] + num[j] + num[k]; 
				if (sum == 0) {
					//find a solution
					ArrayList<Integer> oneR = new ArrayList<Integer>();
					oneR.add(num[i]);
					oneR.add(num[j]);
					oneR.add(num[k]);
					result.add(oneR);
					
					//skip dulplicate
				//	while (j + 1 < k && num[j+1] == num[j]) j++;
					j++;
				//	while (k-1 > j && num[k] == num[k-1]) k--;
					k--;
				} else if (sum > 0) {
					k--;
				} else {
					j++;
				}
			}
			
			//skip duplicate of i, if no duplicate allow
			/**
			while (i+1 < num.length && num[i+1] == num[i]) {
				i++;
			}
			i++;
			**/
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] s = {-1,0,1,2,-1,-4};
		ArrayList<ArrayList<Integer>> result = threeSum(s);
		System.out.println(result.toString());
	}
}
