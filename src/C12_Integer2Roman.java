
public class C12_Integer2Roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(1994));
	}
	
	public static String intToRoman(int num) {
		int[] baseIntArr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
		String[] baseRomanArr = {"I", "IV", "V", "ZX", "X", "XL", "L", "XC", "C", "LD", "D", "CM", "M"};
		int curNum = num;
		StringBuffer retStr= new StringBuffer();
		
		while (curNum != 0) {
			// find the right position
			if (curNum >= baseIntArr[baseIntArr.length - 1]) {
				retStr.append(baseRomanArr[baseIntArr.length - 1]);
				curNum -= baseIntArr[baseIntArr.length - 1];
			}
			for (int i = 0; i < baseIntArr.length - 1; i++) {
				if (baseIntArr[i] == curNum) {
					retStr.append(baseRomanArr[i]);
					curNum = 0;
					break;
				}
				if (baseIntArr[i] < curNum && baseIntArr[i + 1] > curNum) {
					retStr.append(baseRomanArr[i]);
					curNum -= baseIntArr[i];
				}
			}
		}
		
		return retStr.toString();
    }
}
