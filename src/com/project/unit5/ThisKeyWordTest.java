package com.project.unit5;

public class ThisKeyWordTest {
	public int i;
	public void keyWord(int i) {
		this.i = i;
	}
	
	public static void main(String[] args) {
		
		ThisKeyWordTest t1 =  new ThisKeyWordTest();
		ThisKeyWordTest t2 =  new ThisKeyWordTest();
		
		//调用方法时,编译器做了一些幕后工作.
		//他暗自把操作对象的引用作为第一个参数传递给方法.
		
		t1.keyWord(1);  // 相当于  ThisKeyWordTest.keyWord(t1,1);
		t2.keyWord(2);  // 由于这个引用是编译器偷偷传入的,所以没有标识符可用.所以有个专门的关键词 : this
						//this只能在方法内部使用,表示 "调用方法的那个对象" 的引用
	}
}
