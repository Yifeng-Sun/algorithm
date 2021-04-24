package lc.q605;

class Solution {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int cnt = 0;
		if(flowerbed[1] == 0 && flowerbed[1] == 0){
			flowerbed[0] = 1;
			cnt++;
		}
		for(int i = 1; i < flowerbed.length - 1; i++){
			int fore = flowerbed[i - 1];
			int next = flowerbed[i + 1];
			if((flowerbed[i] == 0) && (fore == 0) && (next == 0)){
				flowerbed[i] = 1;
				cnt++;
			}
		}

		if(flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0){
			cnt++;
		}

		if(cnt>=n){
			return true;
		}else return false;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2));
	}
}
