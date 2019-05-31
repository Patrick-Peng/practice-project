package com.project.unit5;


/**
 * 在创建对象时, 将会为对象分配存储空间并调用对应的构造器
 * 构造器的名称必须与类名完全相同,所以方法名首字母小写的编码风格不适用于构造器
 * 如果没有定义构造器,编译器会自动创建一个无参的默认构造器
 * 如果定义了构造器,无论有没有参数,编译器都不会再创建默认构造器
 * 
 * @author patrickpeng
 *
 */
public class ConstructorTest {
	ConstructorTest(int i){
		
	}
	public static void main(String[] args) {
		//ConstructorTest c = new ConstructorTest();  编译报错
		ConstructorTest constructorTest = new ConstructorTest(1);
	}
}
