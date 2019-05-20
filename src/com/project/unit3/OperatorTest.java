package com.project.unit3;

/**
 * operators    + , - , * , / , = , == , != , +=
 */
public class OperatorTest {
	public static void main(String[] args) {
		int x = 1 , y = 2 , z = 3; // 用逗号分隔的多对象声明
		int a = x + y - 2/2 + z , b = x + (y -2)/(2 + z);
		// 优先级 : 先乘除 后加减   有括号的话,括号里最优先执行
		System.out.println(a + "-----" + b);
	}
}
