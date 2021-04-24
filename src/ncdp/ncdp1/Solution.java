package ncdp.ncdp1;

import java.util.*;
import java.math.*;

import static java.lang.Integer.max;

public class Solution {
	/**
	 * max sum of the subarray
	 * @param arr int整型一维数组 the array
	 * @return int整型
	 */
	public int maxsumofSubarray (int[] arr) {
		// write code here
		int m = 0;
		for(int i = 1; i < arr.length; i++){
			arr[i] = max(arr[i], arr[i - 1] + arr[i]);
			m = max(m,arr[i]);
		}
		return m;
	}
}
