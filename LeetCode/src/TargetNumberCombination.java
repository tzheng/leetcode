
public class TargetNumberCombination {
	
	private static int sz = 3;
	
	public static boolean contains(int[] arr, int value){
		for(int i=0; i < arr.length; i++){
			if(arr[i] == value) return true;
		}
		return false;
	}

	public static void printArray(int[] arr, int sz){
		for(int i = 0; i< sz; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

	public static void printComposition(int[] value, int[] retSet, int sz, int target, int preValue){
		if(target < 0) return;
		
		if(target == 0){
			printArray(retSet, sz);
			return;
		}
		
		for(int i = preValue; i <= target ; i++){
			if(contains(value, i)){
				retSet[sz] = i;
				printComposition(value, retSet, sz + 1, target - retSet[sz], i);
			}
		}

	}
		
	private static void solve(int target, int sum, int[] candidates) {
		
	}
	
	public static void main(String[] args) {
		int[] value = {6,9,20};
		int[] retSet = new int[100];
		
		printComposition(value, retSet, 0, 24, 6);
	}
}
