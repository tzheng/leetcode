
public class LongestPalindromicSub {
	private static String expendAroundCenter(String s, int l, int r) {
		int n = s.length();
		while (l >=0 && r <= n-1 && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;
		}
		return s.substring(l+1, r);
	}
	// n^2 time, 1 space
	public static String longestP(String str) {
		int n = str.length();
		if (n == 0) return null; 
		String longest = str.substring(0,1); // single string
		
		for (int i = 0; i < n-1; i++) {
			String p1 = expendAroundCenter(str, i, i); //aba
			if (p1.length() > longest.length())
				longest = p1;
			String p2 = expendAroundCenter(str, i, i+1); //abba
			if (p2.length() > longest.length())
				longest = p2;
		}
		
		return longest;
	}
	
	//http://leetcode.com/2011/11/longest-palindromic-substring-part-i.html
	public static void main(String[] args) {
		String str = "abacddcafg";
		System.out.println(longestP(str));
	}
}	
