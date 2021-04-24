package co.RotateArray;

class Solution {
	public int[] solution(int[] A, int K) {
		// write your code in Java SE 8
		if(A.length == 1 || A.length == 0){
			return A;
		}
		if(A.length == K){
			return A;
		}
		int[] newArray = new int[A.length];
		for(int i = 0; i < K; i++){
			newArray[0] = A[A.length - 1];
			for(int j = 1; j < A.length; j++){
				newArray[j] = A[j - 1];
			}
			A = newArray.clone();
		}
		return newArray;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] res = s.solution(new int[] { 3, 8, 9, 7, 6 },3);
		System.out.println(res.toString());
		int i  =1;
	}
}
