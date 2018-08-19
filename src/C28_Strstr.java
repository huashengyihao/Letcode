
public class C28_Strstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("aaa", "aaaa"));
	}

	public static int strStr(String haystack, String needle) {
        int rtnPos = 0;
        int index = 0;
    	int i = 0;
    	boolean find = false;
        
        if (needle == null || needle.equals("")) {
        	return 0;
        }
        for (i = 0; i < haystack.length(); i++) {
        	if (haystack.length() - i < needle.length()) {
        		break;
        	}
        	if (haystack.charAt(i) == needle.charAt(0)) {
        		for (index = 1; index < needle.length(); index++) {
        			if (index >= haystack.length() - i) {
        				return 0;
        			}
        			if (needle.charAt(index) != haystack.charAt(i + index)) {
        				break;
        			}
        		}
        		if (index == needle.length()) {
        			rtnPos = i;
        			find = true;
        			break;
        		}
        	}
	    }
        if (!find) {
        	rtnPos = -1;
        }
        
        return rtnPos;
    }
}
