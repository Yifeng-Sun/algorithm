package tx418.f;

import java.util.*;


class ListNode {
  int val;
  ListNode next = null;
}


public class Solution {
	/**
	 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
	 *
	 * @param S ListNode类 val表示权值，next指向下一个元素
	 * @return ListNode类
	 */
	public ListNode solve (ListNode S) {
		// write code here
		ListNode cur = S;
		int cnt = 1;
		while(cur.next != null){
			cur = cur.next;
			cnt++;
		}
		cur.next = S;
		cur = S;
		int[] score = new int[cnt];
		for(int i = 0; i < cnt; i++){
			//找到当前node
			for(int j = 0; j < i; j++){
				cur = cur.next;
			}
			//计算以它为头的字典序
			StringBuffer sb = new StringBuffer();
			int curScore = 0;
			for(int calculated = 0; calculated < cnt; calculated++){
//				curScore += cur.val;
//				curScore *= 100;
//				cur = cur.next;
				sb.append(cur.val);
				cur = cur.next;
			}
			curScore = Integer.valueOf(sb.toString());
			score[i] = curScore;
		}
		int minval = Integer.MAX_VALUE;
		int minindex = 0;
		int valcnt = 0;
		for(int val:score){
			if(val<minval) {
				minval = val;
				minindex = valcnt;
			}
			valcnt++;
		}
		ListNode toReturn = S;
		for(int i = 0; i < minindex; i++){
			toReturn = toReturn.next;
		}
		ListNode toReturnCur = toReturn;
		while(toReturnCur.next!=toReturn){
			toReturnCur = toReturnCur.next;
		}
		toReturnCur.next = null;
		return toReturn;
	}

	public static void main(String[] args) {
		ListNode n = new ListNode();
		n.val = 5;
		n.next = new ListNode();
		n.next.val = 4;
		n.next.next = new ListNode();
		n.next.next.val = 23;
		Solution solution = new Solution();
		System.out.println(solution.solve(n).val);
	}
}
