
public class C5_LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("babba"));
	}
	
	public static String longestPalindrome(String s) {
		int startPos = 0;
		int endPos = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (endPos - startPos >= s.length() - i) {
				break;
			}
			for (int j = s.length(); j > i; j--) {
				if (isPalindromeStr(s.substring(i, j)) && (j - i > endPos - startPos)) {
					startPos = i;
					endPos = j;
				}
			}
		}
		
        return s.substring(startPos, endPos);
    }

	public static boolean isPalindromeStr(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(s.length() - i - 1) != s.charAt(i)) {
				return false;
			}
		}
		return true;
    }
}
