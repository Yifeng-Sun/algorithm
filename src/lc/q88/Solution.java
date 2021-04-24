package lc.q88;

class Solution {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int cur = m + n - 1;
		int cur1 = m - 1;
		int cur2 = n - 1;
		while (cur >= 0 && cur1 >= 0 && cur2 >= 0) {
			if (cur1 >= 0 && cur2 >= 0 && nums1[cur1] > nums2[cur2]) {
				nums1[cur--] = nums1[cur1--];
			} else {
				nums1[cur--] = nums2[cur2--];
			}
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		s.merge(new int[] { 0 }, 0, new int[] { 1 }, 1);
	}
}
