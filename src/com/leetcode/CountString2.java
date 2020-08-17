package com.leetcode;

/**
 * 字符串相加的问题
 * 
 * @author Eden.Chen
 *
 */
public class CountString2 {
	public String addString(String s1, String s2) {
		StringBuffer result = new StringBuffer();
		int length1 = s1.length() - 1;
		int length2 = s2.length() - 1;
		// 下一位需要增加的数量
		int add = 0;
		while (length1 >= 0 || length2 >= 0 || add > 0) {
			int i = length1 >= 0 ? s1.charAt(length1) - '0' : 0;
			int m = length2 >= 0 ? s2.charAt(length2) - '0' : 0;
			int sum = i + m + add;
			result.append(sum % 10);
			add = sum / 10;
			length1--;
			length2--;
		}
		result.reverse();
		return result.toString();
	}
	
	public static void main(String[] args) {
		CountString2 cs2 =new CountString2();
		cs2.addString("123", "987");
		System.out.println(cs2.addString("123", "987"));
	}
}
