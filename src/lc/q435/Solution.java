package lc.q435;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals, (int[] x, int[] y)->x[1]-y[1]);
		System.out.println(intervals[1][1]);
		int cur = Integer.MIN_VALUE;
		int cnt = 0;
		for(int i = 0; i < intervals.length; i ++){
			if(intervals[i][0] >= cur){
				cur = intervals[i][1];
			}else cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int [][] twod = new int[][]{{1,2},{3,4},{2,3},{-100,-2},{5,7}};
		System.out.println(s.eraseOverlapIntervals(twod));
	}
}
