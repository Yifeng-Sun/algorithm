package qwe;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

	public static String findString(String[] strings){
		// 写一段代码,输出出现最多的字符串以及次数(最多的只有一个,元素数量>1)
		// ["aa", "bd", "aa", "cx"] // 输出 aa 2
		Arrays.sort(strings);
		int currentCount = 0;
		String currentString = "";
		String prev = "";
		int maxCount = 0;
		String maxString = "";

		for(int i = 0; i < strings.length; i ++){
			currentString = strings[i];
			if(currentString.equals(prev)){
				currentCount++;
				if(currentCount > maxCount){
					maxCount = currentCount;
					maxString = currentString;
				}
			}else{
				prev = currentString;
				currentCount = 1;
			}
		}
		return maxString + " " + maxCount;
	}

	public static ArrayList getRes(int len){
		if(len == 0){
			return null;
		}
		if(len == 1){
			ArrayList arrayList2 = new ArrayList();
			arrayList2.add(2);
			return arrayList2;
		}
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(2);
		integers.add(3);
		for(int i = 2; i <= len; i++){
			integers.add(integers.get(i - 1) + integers.get(i - 2));
		}
		return integers;
	}


	public static ArrayList getRes2(int len){
		if(len == 0){
			return null;
		}
		if(len == 1){
			ArrayList arrayList2 = new ArrayList();
			arrayList2.add(2);
			return arrayList2;
		}
		if(len == 2){
			ArrayList arrayList3 = new ArrayList();
			arrayList3.add(2);
			arrayList3.add(3);
			return arrayList3;
		}


		//RECURSIVE

		ArrayList<Integer> integers = new ArrayList<>(len);
		integers.add(2);
		integers.add(3);
		int i = 2;
		if(i < len){
			integers = extend(integers);
		}

		return integers;

	}

	private static ArrayList extend(ArrayList<Integer> arrayList){
		int length = arrayList.size();
		arrayList.add(arrayList.get(length - 1) + arrayList.get(length - 2));
		return arrayList;
	}

	public static void main(String[] args) {
		String[] strings = {"aa", "bd", "aa", "cx"};
		System.out.println(findString(strings));
	}
}

