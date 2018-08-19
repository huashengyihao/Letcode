import java.util.ArrayList;
import java.util.List;

public class C22_GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C22_GenerateParentheses instance = new C22_GenerateParentheses();
		System.out.println(instance.generateParenthesis(3));
	}

	
	public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String curStr, int open, int close, int max){
        if (curStr.length() == max * 2) {
            ans.add(curStr);
            return;
        }

        if (open < max)
            backtrack(ans, curStr+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, curStr+")", open, close+1, max);
    }
}
