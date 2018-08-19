import java.util.ArrayList;

public class C27_RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] input = {0,1,2,2,3,0,4,2};
		ArrayList<Integer> input = new ArrayList<Integer>();
//		input.add(0);
//		input.add(1);
//		input.add(2);
//		input.add(2);
//		input.add(3);
//		input.add(0);
//		input.add(4);
		input.add(2);
		System.out.println(removeElement(input, 3));
		System.out.println("====");
		for (int i = 0; i < input.size(); i++) {
			System.out.println(input.get(i));
		}
	}

	public static int removeElement(ArrayList<Integer> nums, int val) {
        int len = nums.size();
        int count = 0;
        int eqPos = 0;
        int neqPos = 0;
        int auxVal = 0;

        while (eqPos < len) {
        	if (nums.get(eqPos) == val) {
        		neqPos = eqPos + 1;
        		while (neqPos < len && nums.get(neqPos) == val) {
        			neqPos++;
        		}
        		if (neqPos >= len) {
        			break;
        		} else {
        			auxVal = nums.get(eqPos);
        			nums.set(eqPos, nums.get(neqPos));
        			nums.set(neqPos, auxVal);
        		}
        	}
        	eqPos++;
        }
        for (int i = 0; i < len; i++) {
        	if (nums.get(i) != val) {
    			count++;
    		} else {
    			break;
    		}
        }
        
        return count;
    }
}
