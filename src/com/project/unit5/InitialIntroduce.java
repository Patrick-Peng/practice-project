package com.project.unit5;

public class InitialIntroduce {
	InitialTestObject j = new InitialTestObject(1);
	InitialTestObject k = new InitialTestObject(2);
//	变量定义的先后顺序决定了初始化的顺序
//	无论创建多少个对象,静态数据都只占用一份存储区域 ,且初始化时静态优先,static不能用于局部变量
//	静态初始化只有在必要时才会进行 (第一个对象创建或第一次访问静态数据时) , 之后静态对象不会再被初始化
	static InitialTestObject i = new InitialTestObject(3);
	
//	静态初始化与非静态初始化块
	static{
	}
	{
	}
	
	public static void main(String[] args) {
		int a;
//		System.out.println(a);  编译报错,要求初始化变量。   
//		类的基本数据类型的成员变量都会有一个默认的初始值
//		当类里定义一个对象引用时,如果不将其初始化,此引用会获得一个特殊值 null
		InitialTestObject introduce0 = InitialIntroduce.i;
		InitialIntroduce introduce1 = new InitialIntroduce();
		InitialIntroduce introduce2 = new InitialIntroduce();
		arrayInitial();
		for (int a1int : a1) {
			System.out.println(a1int);
		}
	}
	
//	自动初始化会先于构造器进行,所以i会先被设成1,再被设成4.
	InitialIntroduce(){
		j = new InitialTestObject(4);
	}
	
//	数组只是相同类型、用一个标识符名称封装到一起的一个对象序列.
//	数组是通过括号下标操作符[]来定义和使用的. 要定义一个数组,只需在类型后面加上一对方括号[]
	static int[] a1 = {0,1,2};
	static int[] a2;
	static int[] a3;
	static int[] a4;
	public static void arrayInitial() {
//		a1 = {1,2,3}; 编译报错,特殊的初始化表达式,只能在创建数组的地方出现
//		还可以用new的方式创建数组
		a3 = new int[1];
//		还可以创建的同时初始化数组 , 用new的方式可以在任意地方使用
		a4 = new int[]{0,1,2};
//		赋值只是复制了对象的引用
		a2 = a1;
		a2[0] = 1;
		a2[1] = 2;
		a2[2] = 3;
	}
//	可变参数
	public void arrayParamMethod(Object... params) {
	}
}
