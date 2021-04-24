//package lc.q179;
//
//import java.util.Arrays;
//
//class Solution {
//	public String largestNumber(int[] nums) {
//		int length = nums.length;
//		String[] strs = new String[length];
//		for(int i = 0; i < length; i++){
//			strs[i] = String.valueOf(nums[i]);
//		}
//		Arrays.sort(strs,(a,b)->{return (b+a).compareTo(a+b);});
//
//	}
//}
