package com.leetcode;

/**
 * 字符串相加的问题
 * 
 * @author Eden.Chen
 *
 */
public class CountString {
	// 123 123
	public String addStrings(String num1, String num2) {
		int i = num1.length() - 1, j = num2.length() - 1, add = 0;
		StringBuffer ans = new StringBuffer();
		while (i >= 0 || j >= 0 || add != 0) {
			// 这里减去0 是应为asc吗 0是48为 这里的1其实是int的49
			int x = i >= 0 ? num1.charAt(i) - '0' : 0;
			System.out.println("x->" + x);
			int y = j >= 0 ? num2.charAt(j) - '0' : 0;
			System.out.println("y->" + y);
			int result = x + y + add;
			ans.append(result % 10);
			add = result / 10;
			i--;
			j--;
		}
		// 计算完以后的答案需要翻转过来
		ans.reverse();
		return ans.toString();
	}
}
