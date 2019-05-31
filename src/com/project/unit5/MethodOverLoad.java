package com.project.unit5;
/**
 * 方法重载 : 重载的方法独一无二的参数列表,甚至参数的顺序不同都可以
 * @author patrickpeng
 *
 */
public class MethodOverLoad {
	public void overload() {
		
	}
//	private void overload() {
//	}
//	编译报错
//	public String overload() {
//	}
//  只能靠不同的参数列表重载方法
	
	public void overload(int i, String s) {
		
	}
	
	public void overload(String s, int i) {
		// 不建议调换参数顺序进行方法重载,避免混淆
	}
}
