
public class LongestSubString {
	    
	    private static boolean inStr(String str, char c) {
	        if (str.length() == 0) return false;
	    	for (int i=0; i<str.length(); i++ ) {
	            char ch = str.charAt(i);
	            if (ch == c) return true;
	        }
	        return false;
	    }

	    private static int longest(String str, int index) {
	    	String sub = "";
	    	for (int i = index; i<str.length(); i++) {
	    		char c = str.charAt(i);
	    		if (!inStr(sub, c)) {
	    			sub += c;
	    		}
	    	}
	    	
	    	return sub.length();
	    }
	    
	    public static int lengthOfLongestSubstring(String s) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	    	int length = 0;
	    	int max = 0;
	    	for (int i = 0; i<s.length(); i++ ){
	            length = longest(s, i);
	            if ( length > max ) {
	            	max = length;
	            }
	        }
	        
	        return max;
	    }

	    public static void main(String[] args) {
	    	System.out.println(lengthOfLongestSubstring("abcdcefcg"));
	    }
}
