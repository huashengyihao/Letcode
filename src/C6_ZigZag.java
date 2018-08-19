
public class C6_ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(convert("PAYPALISHIRING", 3));
	}

	public static String convert(String s, int numRows) {
		int numCols = 0;
		int vCycle = 0;
		int newPos = 0;
		int oriPos = 0;
		
		if (numRows == 1 || s.length() <= numRows) {
			return s;
		}
		// the cycle with 'V' shape
		vCycle = 2 * numRows - 2;
		numCols = (s.length() % vCycle == 0) ? (s.length() / vCycle) : (s.length() / vCycle + 1);
		numCols *= 2;
		char retStr[] = new char[numCols * numRows];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				newPos = numCols * i + j;
				if (j % 2 == 0) {
					// even column
					oriPos = i + vCycle * (j / 2);
				} else {
					// odd column
					if (i == 0 || i == numRows - 1) {
						// the first line or the last line
						retStr[newPos] = ' ';
						continue;
					} else {
						oriPos = vCycle * ((j + 1) / 2) - i;
					}
				}
				// out of bound
				if (oriPos >= s.length()) {
					retStr[newPos] = ' ';
					continue;
				} else {
					retStr[newPos] = s.charAt(oriPos);
				}
			}
		}
				
		return (new String(retStr)).replaceAll(" ", "");
	}
}
