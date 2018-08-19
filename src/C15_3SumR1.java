import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C15_3SumR1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] input = {-13,5,13,12,-2,-11,-1,12,-3,0,-3,-7,-7,-5,-3,-15,-2,14,14,13,6,-11,-11,5,-15,-14,5,-5,-2,0,3,-8,-10,-7,11,-5,-10,-5,-7,-6,2,5,3,2,7,7,3,-10,-2,2,-12,-11,-1,14,10,-9,-15,-8,-7,-9,7,3,-2,5,11,-13,-15,8,-3,-7,-12,7,5,-2,-6,-3,-10,4,2,-5,14,-3,-1,-10,-3,-14,-4,-3,-7,-4,3,8,14,9,-2,10,11,-10,-4,-15,-9,-1,-1,3,4,1,8,1};
		int[] input = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> retList = threeSum(input);
		for (int i = 0; i < retList.size(); i++) {
			System.out.println(retList.get(i));
		}
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> retList = new LinkedList<List<Integer>>();
		List<Integer> tmpList = null;
		int preIndex = 0;
		int lastIndex = 0;
		
		// sort the original array
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				break;
			}
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			preIndex = i + 1; lastIndex = nums.length - 1;
			while (preIndex < lastIndex) {
				if (nums[preIndex] + nums[lastIndex] + nums[i] == 0) {
					tmpList = new LinkedList<Integer>();
					tmpList.add(nums[preIndex]);
					tmpList.add(nums[i]);
					tmpList.add(nums[lastIndex]);
					retList.add(tmpList);
					while (preIndex < lastIndex && nums[preIndex] == nums[preIndex + 1]) {
						preIndex++;
					}
                    while (preIndex < lastIndex && nums[lastIndex] == nums[lastIndex - 1]) {
                    	lastIndex--;
                    }
                    preIndex++; lastIndex--;
				} else if (nums[preIndex] + nums[lastIndex] + nums[i] < 0) {
					preIndex++;
				} else {
					lastIndex--;
				}
			}
		}
		
		return retList;
	}
}
