package com.project.unit6;

// 或者 import java.util.*;
// 包是管理名字空间的机制 , 避免与其他类库有相同名字的类时无法区分
import java.util.ArrayList;

/**
 * 访问权限修饰词,主要是用于以供类库开发人员向客户端程序员指明哪些是可用的,哪些是不可用的
 * 权限从大到小依次为  :  public , protected , 默认(无修饰词) , private
 * @author patrickpeng
 *
 */
public class AccessControlIntroduce {
	public static void main(String[] args) {
		ArrayList<String> arrayList =  new ArrayList<String>();
	}
}
