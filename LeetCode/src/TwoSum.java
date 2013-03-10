import java.util.Hashtable;


public class TwoSum {
	
	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		result[0] = -1;
		result[1] = -1;
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			int remain = target - numbers[i];
			boolean contain = false;
			for (int value : table.keySet()) {
				if (value == remain) {
					contain = true;
					break;
				}
			}
			if (contain) {
				result[0] = i;
				result[1] = table.get(remain);
				return result;
			} else {
				table.put(numbers[i], i);
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		int[] numbers = {6,75,95,25,5};
		int[] result = twoSum(numbers, 100);
		
		System.out.println(result[0] + " " + result[1]);
	}
}
