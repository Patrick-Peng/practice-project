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
		
		// 基本数据类型存储了实际的值,而并非指向一个对象的引用,所以在赋值是,是从一个地方的内容赋值到了另一个地方
		int a1 = 1;
		int a2 = a1;
		a1 = 2;
		System.out.println(a1 + "-----" + a2);
		// 但是在为对象赋值时,实际是将引用从一个地方复制到另一个地方,指向的对象其实都是同一个
		Tank tank1 = new Tank();
		Tank tank2 = new Tank();
		tank1.level = 1;
		tank2.level = 10;
		System.out.println("tank1.level:" + tank1.level + " tank2.level:" +tank2.level);
		tank1 = tank2;
		System.out.println("tank1.level:" + tank1.level + " tank2.level:" +tank2.level);
		tank1.level = 20;
		System.out.println("tank1.level:" + tank1.level + " tank2.level:" +tank2.level);
		tank2.level = 30;
		System.out.println("tank1.level:" + tank1.level + " tank2.level:" +tank2.level);
		
		System.out.println(5/2);
		System.out.println(5%2);
		System.out.println(5.5/2);
		System.out.println(5.5%2);
		int i = 0;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i);
		
		// 截尾和舍入     将double 和 float转型为整数时 会截去小数部分
		double above = 0.7, blow = 0.3;
		double fabove = 0.7, fblow = 0.3;
		System.out.println("(int)above : " + (int)above);
		System.out.println("(int)blow : " + (int)blow);
		System.out.println("(int)fabove : " + (int)fabove);
		System.out.println("(int)fblow : " + (int)fblow);
	}
}
