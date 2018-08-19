import java.util.ArrayList;

public class C26_RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(0);
		input.add(0);
		input.add(1);
		input.add(1);
		input.add(2);
		input.add(2);
//		input.add(3);
//		input.add(0);
//		input.add(4);
//		input.add(2);
		System.out.println(removeDuplicates(input));
		for (int i = 0; i < input.size(); i++) {
			System.out.println(input.get(i));
		}
	}

	public static int removeDuplicates(ArrayList<Integer> nums) {
		int count = 1;
		int fillPos = 1;
		
		if (nums.size() < 2) {
			return 1;
		}
		for (int i = 0; i < nums.size() - 1; i++) {
			if (nums.get(i + 1) == nums.get(i)) {
				continue;
			} else {
				nums.set(fillPos, nums.get(i + 1));
				fillPos++;
				count++;
			}
		}
		
		return count;
    }
}
