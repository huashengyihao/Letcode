import java.util.Stack;

public class C20_ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("{[]}"));
	}
	
	public static boolean equalTo(char c1, char c2) {
		if ((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}'))
			return true;
		else
			return false;
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		int index = 0;
		
		if (s.length() <= 0) {
			return false;
		}
		while (index < s.length()) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(index));
			} else {
				if (equalTo(stack.lastElement(), s.charAt(index))) {
					stack.pop();
				} else {
					stack.push(s.charAt(index));
				}
			}
			index++;
		}
		if (stack.isEmpty()) {
			return true;
		} else {
	        return false;
		}
    }
}
