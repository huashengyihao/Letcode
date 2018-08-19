
public class C8_atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi(args[0]));
	}
	
	public static int myAtoi(String str) {
		char cur_char = '0';
		long ret_integer = 0;
		int type = 0;
		int first_num_pos = -1;
		int outbound = 0;
		int str_index = 0;
		int int_arr_index = 0;
		int[] int_arr = new int[10];
		
		if (str.length() < 1) {
			System.out.println("Invalid input");
			return 0;
		}
		for (str_index = 0; str_index < str.length(); str_index++) {
			cur_char = str.charAt(str_index);
			if (cur_char == ' ') {
				continue;
			} else {
				break;
			}
		}
		if (str_index == str.length()) {
			return 0;
		}
		// judge the minus or plus char
		if (str.charAt(str_index) == '-') {
			type = -1;
			str_index++;
		} else if (str.charAt(str_index) == '+') {
			type = 1;
			str_index++;
		}
		if (type != 0) {
			if (str.length() == str_index) {
				return 0;
			}
			if (str.charAt(str_index) > '9' || str.charAt(str_index) < '0') {
				return 0;
			} else {
				// find the first non-zero numerical value
				while (str.charAt(str_index) == '0') {
					++str_index;
				}
				if (str.length() == str_index) {
					return 0;
				}
				if (str.charAt(str_index) > '9' || str.charAt(str_index) < '0') {
					return 0;
				} else {
					first_num_pos = str_index;
					int_arr[int_arr_index] = str.charAt(first_num_pos) - '0';
					int_arr_index++;
					str_index++;
				}
			}
		}
		for (int i = str_index; i < str.length(); i++) {
			cur_char = str.charAt(i);
			if (cur_char <= '9' && cur_char >= '0') {
				if (cur_char == '0' && first_num_pos == -1) {
					continue;
				} else if (cur_char != '0' && first_num_pos == -1) {
					first_num_pos = i;
				}
				// out of bound
				if (int_arr_index > 9) {
					outbound = 1;
					break;
				} else {
					int_arr[int_arr_index] = cur_char - '0';
					int_arr_index++;
				}
			} else { 
				// the first char but not a numerical value
				if (i == str_index && type == 0) {
					return 0;
				} else {
					break;
				}
			}
		}

		if (outbound == 1) {
			if (type == -1) return (int) (-1 * Math.pow(2, 31));
			else return (int) (Math.pow(2, 31) - 1);
		}
		for (int i = 0; i < int_arr_index; i++) {
			ret_integer += int_arr[i] * Math.pow(10, int_arr_index - i - 1);
		}
		if (type >= 0 && ret_integer > Math.pow(2, 31) - 1) {
			return (int) (Math.pow(2, 31) - 1);
		} else if (type == -1 && ret_integer > Math.pow(2, 31)) {
			return (int) (-1 * Math.pow(2, 31));
		} else {
			return (int)(type == -1 ? (-1 * ret_integer) : ret_integer);
		}
	}
}
