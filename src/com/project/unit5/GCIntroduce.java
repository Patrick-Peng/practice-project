package com.project.unit5;


/**
 * Java对象并非总被垃圾回收
 * 程序濒临内存耗尽才会开始进行垃圾回收,因为垃圾回收本身也有开销,不是必要时就不用支付这部分开销了
 * @author patrickpeng
 *
 */
public class GCIntroduce {
	/**
	 *	 一旦垃圾回收器准备好释放内存占用的空间,降首先调用finalize()方法,并在下一次垃圾回收动作发生时,才真正回收对象占用的空间
	 *  无论对象是如何创建,垃圾回收器都会负责释放对象所占用的空间,所以finalize的需求仅限于一种特殊情况
	 *  主要是在Java代码中调用非Java代码的情况
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
