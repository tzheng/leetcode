
public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] result = new int[2];
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] numbers = {5,75,25};
		int[] result = twoSum(numbers, 100);
		System.out.println(result[0] + " " + result[1]);
	}
}
