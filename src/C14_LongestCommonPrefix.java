
public class C14_LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"dog","racecar","car"};
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		int minLen = 99999999;
		int charIndex = 0;
		char curChar = ' ';
		boolean quit = false;
		
		if (strs.length == 0) {
			return "";
		}
		for (int i = 0; i < strs.length; i++) {
			if (strs[i] == null || strs[i].length() == 0) {
				return "";
			}
			if (strs[i].length() < minLen) {
				minLen = strs[i].length();
			}
		}
		for (charIndex = 0; charIndex < minLen; charIndex++) {
			curChar = strs[0].charAt(charIndex);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(charIndex) != curChar) {
					// stop
					quit = true;
					break;
				}
			}
			if (quit) {
				// quit search
				break;
			}
		}
		if (charIndex == 0) {
			return "";
		}
        return strs[0].substring(0, charIndex);
    }
}
