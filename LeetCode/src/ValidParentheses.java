import java.util.Stack;


public class ValidParentheses {
	 public boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (isLeft(c)) {
	            st.push(c);
	        }
	        else {
	            if (st.empty()) {
	                return false;
	            }
	            char d = st.pop();
	            if (!match(d,  c)) {
	                return false;
	            }
	        }
	    }
	
	    if (st.empty()) {
	        return true;
	    }
	    else {
	        return false;
	    }
	}

	public boolean isLeft(char c) {
	    return c == '{' || c == '[' || c == '(';
	}
	public boolean match(char c, char d) {
	    return (c == '(' && d == ')') || (c == '[' && d == ']') || (c == '{' && d == '}');
	}
}
