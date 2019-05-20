package com.project.unit2;

/**
 * 操作的标识符是"引用" (reference) 
 * 引用可以独立存在  例如: String s , 此时向 s 发送消息就会造成 NullPointException
 * 
 * new 表示创建一个对象
 * 所有java对象存储在"堆"中
 * 
 * 基本数据类型占用存储空间太小,不用new来创建,而是创建一个并非是引用的变量,这个变量直接储存值,并置于堆栈中,效率更高
 * 基本类型的包装类仍是在堆中创建
 * 
 * BigInteger支持任意精度的整数运算
 * BigDecimal支持任意精度的小数运算
 * 不能用基础数据类型进行精度运算原因在于我们的计算机是二进制的,浮点数没有办法是用二进制进行精确表示
 * 我们的CPU表示浮点数由两个部分组成：指数和尾数   例如 4.015  会被拆分成 4 和 0.015
 *
 * @author patrickpeng
 *
 */
public class ReferenceTest {
	/**
	 *  当声明static时,意味着这个字段或方法不会和包含他的那个类的任何对象关联在一起
	 *  所以即使没有创建任何对象也可以访问其static字段,调用其static方法
	 */
	static String a;
	/**
	 * 方法的必须组成部分
	 * returnType methodName(Argument list){
	 * 		method body
	 * }
	 * 方法名和参数列表(合称"方法签名")唯一的标识出某个方法
	 */
	public static void main(String[] args) {
		String s;
		s = new String("s");
		System.out.println(a); // 全局变量可以不初始化
		System.out.println(s); // 局部变量必须初始化 , 否则使用对象会编译报错
		// 即使创建了两个StaticTest对象,StaticTest.a 也只有一份存储空间
		ReferenceTest test1 = new ReferenceTest();
		ReferenceTest test2 = new ReferenceTest();
		test1.a = "a";
		System.out.println(test1.a);
		System.out.println(test2.a);
		System.out.println(1.0-0.8);
		System.out.println(1.1+0.8);
		System.out.println(1.1*0.9);
		System.out.println(606.3/3000);
	}
	// 引用 s 在作用域终点就消失了 , 但是 s 指向的string对象仍然占据内存空间 , 垃圾回收器会辨别不再被引用的对象并释放这些内存空间
	
}
