import java.util.LinkedList;
import java.util.List;

public class C17_Letter2PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCombinations(""));
	}

	public static List<String> letterCombinations(String digits) {
		List<String> rstList = new LinkedList<String>();
		List<String> initData = new LinkedList<String>();
		List<String> iterRst = new LinkedList<String>();
		String tmpStr = null;
		String letStr = null;
		
		if (digits.equals("")) {
			return rstList;
		}
		
		initData.add("");
		initData.add("");
		initData.add("abc");
		initData.add("def");
		initData.add("ghi");
		initData.add("jkl");
		initData.add("mno");
		initData.add("pqrs");
		initData.add("tuv");
		initData.add("wxyz");
		
		if (digits.length() == 1) {
			letStr = initData.get(digits.charAt(0) - '0');
			for (int i = 0; i < letStr.length(); i++) {
				rstList.add(String.valueOf(letStr.charAt(i)));
			}
			return rstList;
		}
		
		letStr = initData.get(digits.charAt(0) - '0');
		tmpStr = digits.substring(1);
		iterRst = letterCombinations(tmpStr);
		for (int j = 0; j < letStr.length(); j++) {
			for (int k = 0; k < iterRst.size(); k++) {
				rstList.add(String.valueOf(letStr.charAt(j)) + iterRst.get(k));
			}
		}
		
		
		return rstList;
    }
}
