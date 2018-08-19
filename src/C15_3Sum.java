import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class C15_3Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {-13,5,13,12,-2,-11,-1,12,-3,0,-3,-7,-7,-5,-3,-15,-2,14,14,13,6,-11,-11,5,-15,-14,5,-5,-2,0,3,-8,-10,-7,11,-5,-10,-5,-7,-6,2,5,3,2,7,7,3,-10,-2,2,-12,-11,-1,14,10,-9,-15,-8,-7,-9,7,3,-2,5,11,-13,-15,8,-3,-7,-12,7,5,-2,-6,-3,-10,4,2,-5,14,-3,-1,-10,-3,-14,-4,-3,-7,-4,3,8,14,9,-2,10,11,-10,-4,-15,-9,-1,-1,3,4,1,8,1};
//		int[] input = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> retList = threeSum(input);
		for (int i = 0; i < retList.size(); i++) {
			System.out.println(retList.get(i));
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> retList = new LinkedList<List<Integer>>();
		List<List<Integer>> auxRstList = new LinkedList<List<Integer>>();
		List<Integer> tmpList = null;
		Map<List<Integer>, Integer> hm = new HashMap<List<Integer>, Integer>();
		
		// sort the original array
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				tmpList = new LinkedList<Integer>();
				tmpList.add(i);
				tmpList.add(j);
				auxRstList.add(tmpList);
				while (j < nums.length - 1) {
					if (nums[j] == nums[j + 1]) {
						j++;
					} else {
						break;
					}
				}
			}
		}
		for (int i = 0; i < auxRstList.size(); i++) {
			for (int j = 0; j < nums.length; j++) {
				if (auxRstList.get(i).get(0) == j || auxRstList.get(i).get(1) == j) {
					continue;
				}
				if (nums[j] + nums[auxRstList.get(i).get(0)] + nums[auxRstList.get(i).get(1)] == 0) {
					tmpList = new LinkedList<Integer>();
					tmpList.add(nums[j]);
					tmpList.add(nums[auxRstList.get(i).get(0)]);
					tmpList.add(nums[auxRstList.get(i).get(1)]);
					Collections.sort(tmpList);
					if (!hm.containsKey(tmpList)) {
						hm.put(tmpList, 1);
					}
				}
			}
		}
		Iterator iter = hm.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (HashMap.Entry) iter.next();
			Object key = entry.getKey();
			retList.add((List<Integer>)key);
		}
        
		return retList;
    }
}
