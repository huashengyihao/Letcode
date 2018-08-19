import java.util.HashMap;

public class C13_Roman2Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("LVIII"));
	}
	
	public static int romanToInt(String s) {
		int retVal = 0;
		char curChar = ' ';
		HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		for (int i = 0; i < s.length(); i++) {
			curChar = s.charAt(i);
			switch(curChar) {
			case 'I':
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
					retVal += (romanMap.get(s.charAt(i + 1)) - romanMap.get(curChar));
					i++;
				} else {
					retVal += romanMap.get(curChar);
				}
				break;
			case 'X':
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
					retVal += (romanMap.get(s.charAt(i + 1)) - romanMap.get(curChar));
					i++;
				} else {
					retVal += romanMap.get(curChar);
				}
				break;
			case 'C':
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {	
					retVal += (romanMap.get(s.charAt(i + 1)) - romanMap.get(curChar));
					i++;
				} else {
					retVal += romanMap.get(curChar);
				}
				break;
			default:
				retVal += romanMap.get(curChar);
				break;
			}
		}
			
        return retVal;
    }
}
