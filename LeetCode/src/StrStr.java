
public class StrStr {
	public static String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
		 if (haystack.length() < needle.length()) return null;
	       if (haystack.length() == 0) return haystack;
	       if (needle.length() == 0) return haystack;
	       
	       for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
	            if (haystack.charAt(i) == needle.charAt(0)) {
	                boolean match = true; 
	                for (int j = 0; j < needle.length(); j++) {
	                    if (haystack.charAt(i+j) != needle.charAt(j)) {
	                        match = false;
	                        break;
	                    }
	                }
	                if (match)
	                    return haystack.substring(i, haystack.length());
	            }
	        }
	        return null;
	}
	
	public static String strStr1(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if (needle.length() == 0) 
			return haystack;
		if (haystack.length() < needle.length()) return null;
		
		int diff = haystack.length() - needle.length() + 1;
		for (int i = 0; i < diff; i++) {
			if (haystack.substring(i).startsWith(needle))
				return haystack.substring(i);
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(strStr("aaaa", "a"));
	}
}
