package wy;//package wy;
//
//import java.util.*;
//
//
//public class Solution {
//	/**
//	 /**
//	 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//	 *
//	 *
//	 * @param inString string字符串 待判断的字符串
//	 * @param inStringNum int整型 输入字符串长度
//	 * @return int整型
//	 * "[({}[])]",8
//	 */
//	public int getMatchBracketsNum (String inString, int inStringNum) {
//		// write code here
//		int score = 0;
//		if(inString.length() == 0){
//			return 0;
//		}
//		Stack<Character> stack = new Stack();
//		try {
//			for(int index = 0; index < inStringNum; index++){
//				if(inString.charAt(index) == '[' || inString.charAt(index) == '(' || inString.charAt(index) == '{'){
//					stack.push(inString.charAt(index));
//				}else{
//					if(inString.charAt(index) == ']'){
//						if(stack.peek() == '['){
//							stack.pop();
//							score += 2;
//						}
//						else return -1;
//					}
//					if(inString.charAt(index) == ')'){
//						if(stack.peek() == '('){
//							stack.pop();
//							score += 1;
//						}
//						else return -1;
//					}
//					if(inString.charAt(index) == '}'){
//						if(stack.peek() == '{'){
//							stack.pop();
//							score += 3;
//						}
//						else return -1;
//					}
//					if(inString.charAt(index) != '}'&&inString.charAt(index) != ')'&&inString.charAt(index) != ']'){
//						return -1;
//					}
//				}
//			}
//		}
//		catch (Exception e) {
//			return -1;
//		}
//		return score;
//	}
//
//
//	public static void main(String[] args) {
//		Solution solution = new Solution();
//		System.out.println(solution.getMatchBracketsNum("{}({}){}",8));
//	}
//}

import java.util.*;


public class Solution {
	/**
	 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
	 *
	 * 搜索满足条件的日志。 返回值为二维数组，第一维对应待查询时间戳的下标，第二维是命中日志的事件ID
	 * @param logs long长整型二维数组 日志数据，数组第一维的下标即为事件ID，第二维包含两个long型整数，分别表示起始和结束时间
	 * @param tss long长整型一维数组 timestamps，表示待查询的多个时间戳
	 * @return int整型二维数组
	 */
	public int[][] search_log (long[][] logs, long[] tss) {
		// write code here
		ArrayList<Integer[]> wholeList = new ArrayList();
		for(int i = 0; i < tss.length; i ++){
			int cnt = 0;
			ArrayList<Integer> integers = new ArrayList<>();
			for(long[] cur:logs){
				if(tss[i]>=cur[0] && tss[i]<=cur[1]){
					integers.add(cnt);
				}
				cnt++;
			}
			Integer[] ints = new Integer[integers.size()];
			integers.toArray(ints);
			wholeList.add(ints);
		}
		int[][] wholeListArray = new int[wholeList.size()][];
		wholeList.toArray(wholeListArray);
		return wholeListArray;
	}
}
