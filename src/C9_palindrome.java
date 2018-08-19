
public class C9_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(-121));
	}

	public static boolean isPalindrome(int x) {
		int tmp_x = x;
		int num_arr[] = new int[10];
		int x_index = 0;
		
		if (x == 0) {
			return true;
		} else if (x < 0) {
			return false;
		} else {
			while (tmp_x / 10 != 0) {
				num_arr[x_index] = tmp_x % 10;
				tmp_x /= 10;
				x_index++;
			}
			num_arr[x_index] = tmp_x;
			for (int i = 0; i < (x_index + 1) / 2; i++) {
				if (num_arr[x_index - i] != num_arr[i]) {
					return false;
				}
			}
			return true;
		}
    }
}
