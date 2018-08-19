import java.util.LinkedList;
import java.util.List;

public class C46_Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3};
		List<List<Integer>> retIterPermute = permute(input);
		for (int i = 0; i < retIterPermute.size(); i++) {
			System.out.println(retIterPermute.get(i));
		}
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> retIterPermute = new LinkedList<List<Integer>>();
		List<List<Integer>> tmpIterPermute = null;
		LinkedList<Integer> tmpRstList = null;
		int[] leftNums = null;
		int tmpIndex = 0;
		
		if (nums.length == 1) {
			tmpRstList = new LinkedList<Integer>();
			tmpRstList.add(nums[0]);
			retIterPermute.add(tmpRstList);
			
			return retIterPermute;
		}
		
		for (int i = 0; i < nums.length; i++) {
			tmpIndex = 0;
			leftNums = new int[nums.length - 1];
			for (int j = 0; j < nums.length; j++) {
				if (j == i) continue; 
				leftNums[tmpIndex] = nums[j];
				tmpIndex++;
			}
			tmpIterPermute = permute(leftNums);
			for (int k = 0; k < tmpIterPermute.size(); k++) {
				tmpRstList = new LinkedList<Integer>();
				tmpRstList.add(nums[i]);
				tmpRstList.addAll(tmpIterPermute.get(k));
				retIterPermute.add(tmpRstList);
			}
		}
		
		return retIterPermute;
	}
}
