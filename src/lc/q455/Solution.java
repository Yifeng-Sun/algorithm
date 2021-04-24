package lc.q455;

import java.util.Arrays;

class Solution {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0;

		while(true){
			if(i != g.length && i != s.length){
				if(g[i] <= s[i]){
					i += 1;
				}else return i;
			}else return i;
		}

	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.findContentChildren(new int[] { 10, 9, 8, 7 }, new int[] { 5, 6, 7, 8 }));
	}
}

