package ncdp.ncdp2;

import java.util.*;


public class Solution {
	/**
	 * longest common substring
	 * @param str1 string字符串 the string
	 * @param str2 string字符串 the string
	 * @return string字符串
	 */
	public static String LCS (String str1, String str2) {
		// write code here
		String res = "";
		int len1 = str1.length();
		for(int i = 0; i <= len1; i++){
			for(int j = 0; j < i; j++){
				int curlen = i - j + 1;
				String cursb = str1.substring(j,i);
				if(str2.contains(cursb)){
					if(curlen > res.length()){
						res = cursb;
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(LCS("1AB2345CD","12345EF"));
	}
}
