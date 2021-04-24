package co.BinaryGap;

class Solution {
	public int solution(int N) {
		// write your code in Java SE 8
		String s = Integer.toBinaryString(N);
		int lastBay = Integer.MIN_VALUE;
		int curGap = 0;
		int maxGap = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '1'){
				if(lastBay != Integer.MIN_VALUE){
					curGap = i - lastBay - 1;
					lastBay = i;
					if(curGap>maxGap){
						maxGap = curGap;
					}
				}else lastBay = i;
			}
		}
		return maxGap;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(9));
	}
}

